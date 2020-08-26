package easy._900_999._929_unique_email_addresses;

//Every email consists of a local name and a domain name, separated by the @ sign. 
//
// For example, in alice@leetcode.com, alice is the local name, and leetcode.com
// is the domain name. 
//
// Besides lowercase letters, these emails may contain '.'s or '+'s. 
//
// If you add periods ('.') between some characters in the local name part of an
// email address, mail sent there will be forwarded 
// to the same address without dots in the local name. 
// For example, "alice.z@leetcode.com" and "alicez@leetcode.com"  forward to the same email address. 
// (Note that this rule does not apply for domain names.) 
//
// If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. 
// This allows certain emails to be filtered, 
// for example m.y+name@email.com will be forwarded to my@email.com. 
// (Again, this rule does not apply for domain names.) 
//
// It is possible to use both of these rules at the same time. 
//
// Given a list of emails, we send one email to each address in the list. 
// How many different addresses actually receive mails? 
//
// 
//
// 
// Example 1: 
//
// 
//Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
//Output: 2
//Explanation:"testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
// 
//
// 
//
// Note: 
//
// 
// 1 <= emails[i].length <= 100 
// 1 <= emails.length <= 100 
// Each emails[i] contains exactly one '@' character. 
// All local and domain names are non-empty. 
// Local names do not start with a '+' character. 
// 
// 
// Related Topics String 
// 👍 897 👎 191


import java.util.HashSet;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:8 ms,击败了88.45% 的Java用户
  //  内存消耗:39.6 MB,击败了83.80% 的Java用户
//  public int numUniqueEmails(String[] emails) {
//    HashSet set = new HashSet();
//    for (String email : emails) {
//      String[] emailArr = email.split("@");
//      StringBuilder sb = new StringBuilder();
//      char[] preArr = emailArr[0].toCharArray();
//      for (int i = 0; i < preArr.length; i++) {
//        if (preArr[i] == '+') {
//          break;
//        } else if (preArr[i] != '.') {
//          sb.append(preArr[i]);
//        }
//      }
//      set.add(sb.append('@').append(emailArr[1]).toString());
//    }
//    return set.size();
//  }

  //  Runtime: 3 ms, faster than 100.00% of Java online submissions for Unique Email Addresses.
  //  Memory Usage: 39.3 MB, less than 95.43% of Java online submissions for Unique Email Addresses.
  public int numUniqueEmails(String[] emails) {
    HashSet<String> uniqueSet = new HashSet<String>();
    for (String email : emails) {
      uniqueSet.add(simplifyEmail(email));

    }
    return uniqueSet.size();
  }

  private String simplifyEmail(String email) {
    int i = -1;
    int x = 0;
    char c;
    boolean plusSign = false;
    char[] simpleEmailChars = new char[email.length()];
    while ((c = email.charAt(++i)) != '@') {
      if (plusSign) {
        continue;
      }
      if (c == '+') {
        plusSign = true;
      } else if (c != '.') {
        simpleEmailChars[x++] = c;
      }
    }
    while (i < email.length()) {
      simpleEmailChars[x++] = email.charAt(i++);
    }
    return new String(simpleEmailChars, 0, x);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

