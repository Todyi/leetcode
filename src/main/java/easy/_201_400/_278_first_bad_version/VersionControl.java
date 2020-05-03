package easy._201_400._278_first_bad_version;

/**
 * Copyright (c) 2020 by tody.cc
 *
 * @ClassName: VersionControl
 * @Description:
 * @author: tody
 * @Date: 2020-05-03 15:58:41
 */

public class VersionControl {

  public static int badVersion = 1702766719;

  public boolean isBadVersion(int n){
    return badVersion <= n;
  }

}
