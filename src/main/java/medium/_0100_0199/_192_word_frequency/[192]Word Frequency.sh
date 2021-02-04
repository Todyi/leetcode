#Write a bash script to calculate the frequency of each word in a text file words.txt.
#
# For simplicity sake, you may assume: 
#
# 
# words.txt contains only lowercase characters and space ' ' characters. 
# Each word must consist of lowercase characters only. 
# Words are separated by one or more whitespace characters. 
# 
#
# Example: 
#
# Assume that words.txt has the following content: 
#
# 
#the day is sunny the the
#the sunny is is
# 
#
# Your script should output the following, sorted by descending frequency: 
#
# 
#the 4
#is 3
#sunny 2
#day 1
# 
#
# Note: 
#
# 
# Don't worry about handling ties, it is guaranteed that each word's frequency count is unique.
# Could you write it in one-line using Unix pipes? 
# 
# 👍 252 👎 171


#There is no code of Java type for this problem

# Runtime: 0 ms, faster than 100.00% of Bash online submissions for Word Frequency.
# Memory Usage: 3.9 MB, less than 51.70% of Bash online submissions for Word Frequency.
cat words.txt |tr -s ' ' '\n'|sort|uniq -c|sort -nr|awk '{printf("%s %s\n",$2,$1)}'