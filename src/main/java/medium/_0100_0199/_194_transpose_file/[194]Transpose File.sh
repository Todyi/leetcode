#Given a text file file.txt, transpose its content. 
#
# You may assume that each row has the same number of columns and each field is
# separated by the ' ' character. 
#
# Example: 
#
# If file.txt has the following content: 
#
# 
#name age
#alice 21
#ryan 30
# 
#
# Output the following: #
#name alice ryan
#age 21 30
# 
#
# 
# 👍 78 👎 205

#There is no code of Java type for this problem
# Read from the file file.txt and print its transposed content to stdout.

# Runtime: 8 ms, faster than 85.83% of Bash online submissions for Word Frequency.
# Memory Usage: 3.9 MB, less than 51.70% of Bash online submissions for Word Frequency.
colNums=$(head -1 file.txt|wc -w);
i=1;
while [ $i -le $colNums ]
do
    awk "{print \$$i}" file.txt | paste -s -d ' ';
    ((i=$i+1))
done

# Runtime: 0 ms, faster than 100.00% of Bash online submissions for Word Frequency.
# Memory Usage: 3.5 MB, less than 83.20% of Bash online submissions for Word Frequency.
head -1 file.txt | wc -w | xargs seq | xargs -n1 -I{} sh -c "cut -d' ' -f{} file.txt | xargs"
