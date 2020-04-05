#include "OsiStringUtils.h"

int osiris::OsiStringUtils::str2int(std::string str)
{	
	int ret = 0;
	for (int i = 0; i < str.length(); i++) {
		if (str[i] > '9' || str[i] < '0') {
			break;
		}
		ret = ret * 10 + str[i] - '0';
	}
	return 0;
}

std::vector<std::string> osiris::OsiStringUtils::split(std::string str, char c)
{
	std::vector<std::string> ret;
	int i = 0;
	int j = i;
	while (j < str.length()) {
		if (str[j] == c) {
			ret.push_back(str.substr(i, j - i));
			i = j;
		}
		j++;
	}
	ret.push_back(str.substr(i, j - i));
	return ret;
}
