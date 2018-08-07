# https://www.hackerrank.com/challenges/xml-1-find-the-score/problem

def get_attr_number(node):
    count = len(node.attrib)
    for child in node:
        count += get_attr_number(child)
    return count