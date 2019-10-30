#! /usr/bin/env python3

import re

ASYNCAPI_GRAMMAR_FILE = 'AsyncApi.xtext'

with open(ASYNCAPI_GRAMMAR_FILE, 'r') as file:
    keywords = re.findall("'\"\w.+\"'", file.read())
    keywords = list(dict.fromkeys(keywords))
    keywords.sort()
    print('Keyword:\n\t', end='')
    print(*keywords, sep='\n\t| ', end=';')

        