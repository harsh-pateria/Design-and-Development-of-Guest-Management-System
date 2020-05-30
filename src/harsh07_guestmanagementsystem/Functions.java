package harsh07_guestmanagementsystem;

import java.awt.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author harsh-0706
 */

/**
 *
 * All the functions built in this project are built by me.
 * These are the main part of the project or the backbone of the project.
 */
public class Functions {

  /// in the table infor , we need to retrieve some information sometimes.
  /// for that, we have this function which will store all the values
  /// in a vector and return it by sorting.
  public Vector<String> getSomthingz(String column_name, String table_name) {
    Vector<String> ans;
    ans = new Vector<>();

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement st = con.createStatement();

      String sql = "Select " + column_name + " from  " + table_name + " ; ";
      System.out.println("" + sql);
      ResultSet rs = st.executeQuery(sql);
      rs.next();

      while (rs.next()) {
        ans.add(rs.getString(1));
      }
      Collections.sort(ans);
      return ans;
    } catch (ClassNotFoundException | SQLException e) {
      JOptionPane.showMessageDialog(
        null,
        "Error in Functions.getSerialNumber(String s) function\n " + e
      );
    }

    return ans;
  }

  // for the administrator and the user end, it will help
  // to change the password.
  public void ChangePassword(int a, String Password) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement st = con.createStatement();

      String sql =
        "Update Trump set Pass = '" +
        Password +
        "' where serialno = " +
        a +
        "; ";
      System.out.println("" + sql);

      try {
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Password Updated Successfully! ");
      } catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "" + e);
      }
    } catch (ClassNotFoundException | SQLException e) {
      JOptionPane.showMessageDialog(
        null,
        "Password cannot be updated. Error in Functions.ChangePassword(int a, String s) function\n " +
        e
      );
    }
  }

  // the password stored in the database can't be
  public long getHashValue1ofPassword(int a) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement st = con.createStatement();

      String sql = "Select pass from Trump where serialno = " + a + "; ";
      System.out.println("" + sql);
      ResultSet rs = st.executeQuery(sql);
      rs.next();

      //           if (!rs.isBeforeFirst() )
      //           {
      //                  return -1 ;
      //           }

      String ans = rs.getString(1);
      long out = 0;
      out = compute_hash1(ans);
      return out;
    } catch (ClassNotFoundException | SQLException e) {
      JOptionPane.showMessageDialog(
        null,
        "Error in Functions.getSerialNumber(String s) function\n " + e
      );
    }

    return -1;
  }

  public long getHashValue2ofPassword(int a) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement st = con.createStatement();

      String sql = "Select pass from Trump where serialno = " + a + "; ";
      System.out.println("" + sql);
      ResultSet rs = st.executeQuery(sql);
      rs.next();

      //           if (!rs.isBeforeFirst() )
      //           {
      //                  return -1 ;
      //           }

      String ans = rs.getString(1);
      long out = 0;
      out = compute_hash2(ans);
      return out;
    } catch (ClassNotFoundException | SQLException e) {
      JOptionPane.showMessageDialog(
        null,
        "Error in Functions.getSerialNumber(String s) function\n " + e
      );
    }

    return -1;
  }

  //A hashing algorithm is a cryptographic hash function.
  //It is a mathematical algorithm that maps data of arbitrary size to a
  // hash of a fixed size.
  //It's designed to be a one-way function, infeasible to invert.

  // HASHING FUNCTION 1
  public long compute_hash1(String s) {
    int p = 31;
    long m = 1000000007;
    long hash_value = 0;
    long p_pow = 1;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      hash_value = (m + hash_value + (c - 'a' + 1) * p_pow) % m;
      p_pow = (p_pow * p) % m;
    }
    return hash_value;
  }

  // HAshing Function 2
  public long compute_hash2(String s) {
    int p = 53;
    long m = 1000000007;
    long hash_value = 0;
    long p_pow = 1;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      hash_value = (m + hash_value + (c - 'a' + 1) * p_pow) % m;
      p_pow = (p_pow * p) % m;
    }
    return hash_value;
  }

  // returns the unique serial number of the
  // person if we know the unique transaction string
  // If you know the unique identification string of a person // Transaction number
  // then it would return you the serial number of the person.
  // then, you have one more function[  public String getUniqueString(int a) ]
  // using which you can get any other information you wish.
  public int getSerialNumber(String s) {
    int a = 0;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement st = con.createStatement();

      String sql = "Select gsno from Temp where younick = '" + s + "' ;";
      System.out.println("" + sql);
      ResultSet rs = st.executeQuery(sql);
      rs.next();

      //           if (!rs.isBeforeFirst() )
      //           {
      //                  return -1 ;
      //           }

      a = rs.getInt(1);

      return a;
    } catch (ClassNotFoundException | SQLException e) {
      JOptionPane.showMessageDialog(
        null,
        "Error in Functions.getSerialNumber(String s) function\n " + e
      );
    }
    return 0;
    //        return "XDXDXD" ;
  }

  // if you have the unique serial number
  // it'll return you the unique transaction number
  public String getUniqueString(int a) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement st = con.createStatement();

      String sql = "Select younick from Temp where gsno = " + a + " ;";

      ResultSet rs = st.executeQuery(sql);
      rs.next();

      String ans = rs.getString(1);

      return ans;
    } catch (Exception e) {}
    return "XDXDXD";
  }

  //// in the database it updates the values in the column name s to t
  // and the serial number of the person is a
  public void ChangeSomething(String s, String t, int a) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement st = con.createStatement();

      String sql =
        "Update temp set " + s + " = '" + t + "' where gsno = " + a + ";";
      System.out.println(sql);
      try {
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Record updated Successfully !! ");
      } catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(
          null,
          "There is an error with updating the record.\n CHeck Functions.java. \n" +
          e
        );
      }
      con.close();
    } catch (ClassNotFoundException | SQLException | HeadlessException e) {}
  }

  // does something XDXDXD even I don't know
  // Fuckk, I'll update it. XDXDXD
  // in the table temp. it gets the information stored in a column named "s"
  // whose serial number is a .
  // matlab agar serial number pta h, toh unique string bhi return kr dega ye
  // kuch bhi return kar sakta h agar serial number pta h toh
  public String getz(String s, int a) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement st = con.createStatement();
      String sql = "Select " + s + " from Temp where gsno = " + a + " ;";

      ResultSet rs = st.executeQuery(sql);
      rs.next();

      String ans = rs.getString(1);

      return ans;
    } catch (Exception e) {}

    return "harsh";
  }

  // Check if s1 is a substring of s2
  // it checks it in complexity O(N+M)
  public boolean isSubstring(String s1, String s2) {
    // check if s1 is a substring of s2
    int M = s1.length();
    int N = s2.length();

    ///  A loop to slide pat[] one by one
    for (int i = 0; i <= N - M; i++) {
      int j;

      /// For current index i, check for pattern match
      for (j = 0; j < M; j++) if (s2.charAt(i + j) != s1.charAt(j)) break;

      if (j == M) return true;
    }
    return false;
  }

  // This function just aids in checking if the room number is valid or not.
  // It has 104 entries
  // It also has S2D, S2DL,
  // this function basically helps in initializaing the room numbers in all the hostels
  // If you need to change something in the room numbers, then this is the function where
  // you need to change it.
  public Vector<String> Universal() {
    Vector<String> v;
    v = new Vector<>();

    for (int i = 1; i <= 16; i++) {
      if (i % 3 == 0 && i != 9) {
        v.add("S" + i + "S");
      } else {
        v.add("S" + i + "D");
        v.add("S" + i + "D" + "L");
        v.add("S" + i + "D" + "R");
      }
    }

    for (int i = 1; i <= 12; i++) {
      if (i == 2 || i == 7) {
        v.add("Y" + i + "S");
      } else {
        v.add("Y" + i + "D");
        v.add("Y" + i + "D" + "L");
        v.add("Y" + i + "D" + "R");
      }
    }

    for (int i = 1; i <= 12; i++) {
      v.add("G" + i + "D");
      // v.add("G"+i+"D"+"L") ;
      //v.add("G"+i+"D"+"R") ;
    }

    Collections.sort(v);
    return v;
  }

  /// this function checks if the string entered in room number column is valid or not
  // It should be atleast present in the universal set for which I have made a function above
  // See, in the function Universal declared above, we have now initialized all the room numbers
  // now, this function will just check if the string you entered is an element in the universal
  // set.
  public boolean Check_ki_Room_exists(String s) {
    if (s.length() > 5 || s.length() < 3) {
      return false;
    }

    Functions w = new Functions();

    Vector<String> b = new Vector<>();
    b = w.Universal();

    if (b.contains(s)) {
      return true;
    }
    return false;
  }

  // This function fetches all the rooms with normal nomenclature
  // i.e. S2D doesn't mean anything here
  // Remember this function is different from Universal
  public Vector<String> Fetch_All_Rooms() {
    Vector<String> v;
    v = new Vector<>();

    /// Insert all the room numbers here

    for (int i = 1; i <= 16; i++) {
      if (i % 3 == 0 && i != 9) {
        v.add("S" + i + "S");
      } else {
        //                v.add("S"+i+"D") ;
        v.add("S" + i + "D" + "L");
        v.add("S" + i + "D" + "R");
      }
    }

    for (int i = 1; i <= 12; i++) {
      if (i == 2 || i == 7) {
        v.add("Y" + i + "S");
      } else {
        //                v.add("Y"+i+"D") ;
        v.add("Y" + i + "D" + "L");
        v.add("Y" + i + "D" + "R");
      }
    }

    for (int i = 1; i <= 12; i++) {
      //            v.add("G"+i+"D") ;
      v.add("G" + i + "D" + "L");
      v.add("G" + i + "D" + "R");
    }

    Collections.sort(v);
    return v;
  }

  /// if the room number is valid it wil fetch you
  //  the name of the hostel a person is staying
  /// It returns string "Problem" for debugging
  /// if there is an error somewhere.
  public String HostelName(String s) {
    String Y = "Yamuna";
    String G = "Ganga";
    String S = "Saraswati";
    String W = "Problem";
    if (s.charAt(0) == 'Y') {
      return Y;
    }
    if (s.charAt(0) == 'G') {
      return G;
    }
    if (s.charAt(0) == 'S') {
      return S;
    }
    return W;
  }

  /// This function does what is written in the name
  // it gives back the room numbers that are filled
  public Vector<String> Fetch_Filled_Room_Numbers() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement fre = con.createStatement();
      String sql =
        "select groom from Temp where gdepdate IS NULL and gdeptime IS NULL ;";

      ResultSet rsfre = fre.executeQuery(sql);
      Vector<String> v0 = new Vector();
      /// v0 -. vector which contains all the roomnumbers from the table temp ;
      /// who haven't left yet.
      while (rsfre.next()) {
        v0.add(rsfre.getString(1));
      }

      Vector<String> ans = new Vector<>();

      Vector<String> allrooms = new Vector<>();
      allrooms = Universal();

      /// v0 -. vector which contains all the roomnumbers from the table temp ;
      /// who haven't left yet. that is the room is occupied

      /// allrooms-> vector containing universal rooms

      for (int i = 0; i < v0.size(); i++) {
        ans.add(v0.get(i));
      }

      for (int i = 0; i < v0.size(); i++) {
        String y = v0.get(i);
        boolean ok = true;
        for (int j = 0; j < allrooms.size(); j++) {
          // S2D is a substring of S2DR and S2DL
          ok = false;
          if (isSubstring(y, allrooms.get(j))) {
            ok = true;
          }
          if (ok) ans.add(allrooms.get(j));
        }
      }

      con.close();

      for (int i = 0; i < ans.size(); i++) {
        for (int j = 0; j < ans.size(); j++) {
          if (i != j) {
            if (ans.elementAt(i).equalsIgnoreCase(ans.elementAt(j))) {
              ans.removeElementAt(j);
            }
          }
        }
      }

      return ans;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(
        null,
        "There is an error is Functions.Fetch_Filled_Room_Numbers method\n" + e
      );
    }
    return null;
  }

  /// It fetches you all the empty room numbers
  /// in the Hostels
  public Vector<String> Fetch_Empty_Room_Numbers() {
    /// S2DR
    // then S2D shouldnt be there
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement fre = con.createStatement();
      String sql =
        "select groom from Temp where gdepdate IS NULL and gdeptime IS NULL ;";

      ResultSet rsfre = fre.executeQuery(sql);
      Vector<String> v0 = new Vector();
      /// v0 -. vector which contains all the roomnumbers from the table temp ;
      /// who haven't left yet.
      while (rsfre.next()) {
        v0.add(rsfre.getString(1));
      }

      Vector<String> ans = new Vector<>();

      Vector<String> allrooms = new Vector<>();
      allrooms = Universal();

      /// v0 -. vector which contains all the roomnumbers from the table temp ;
      /// who haven't left yet. that is the room is occupied

      /// allrooms-> vector containing universal rooms

      for (int i = 0; i < v0.size(); i++) {
        ans.add(v0.get(i));
      }

      for (int i = 0; i < v0.size(); i++) {
        String y = v0.get(i);
        boolean ok = true;
        for (int j = 0; j < allrooms.size(); j++) {
          // S2D is a substring of S2DR and S2DL
          ok = false;
          if (isSubstring(y, allrooms.get(j))) {
            ok = true;
          }
          if (isSubstring(allrooms.get(j), y)) {
            ok = true;
          }
          if (ok) {
            ans.add(allrooms.get(j));
          }
        }
        //                if(ok)
        //                {
        //                    ans.add(y) ;
        //                }
      }

      // now ans contains all the filled room numbers

      Vector<String> out = new Vector<>();

      for (int i = 0; i < allrooms.size(); i++) {
        boolean check = true;
        for (int j = 0; j < ans.size(); j++) {
          if (allrooms.get(i).equals(ans.get(j))) {
            check = false;
          }
        }
        if (check) out.add(allrooms.get(i));
      }

      con.close();

      return out;
    } catch (ClassNotFoundException | SQLException e) {
      JOptionPane.showMessageDialog(
        null,
        "There is an error is Functions.Fetch_Empty_Room_Numbers method\n" + e
      );
    }
    return null;
  }

  /// it validates the mobile number
  // It completely validates that the mobile number you entered is correct.
  public boolean validatemobilenumber(String s) {
    if (s.length() != 10) {
      JOptionPane.showMessageDialog(
        null,
        "The length of Mobile Number should be 10. Please try again."
      );
      return false;
    }

    if (s.charAt(0) == '0') {
      JOptionPane.showMessageDialog(
        null,
        "The first character of a mobile number cant be 0  "
      );
      return false;
    }

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) < '0' || s.charAt(i) > '9') {
        return false;
      }
    }

    return true;
  }

  /// Checks if a Room is Empty or Not
  /// It should not be taken by someone else
  public boolean Check_if_Room_is_Empty(String s) {
    Vector<String> v = new Vector<>();
    v = Fetch_Empty_Room_Numbers();

    for (int i = 0; i < v.size(); i++) {
      if (v.get(i).equals(s)) {
        return true;
      }
    }

    return false;
  }

  // this function validates thge numerical serial number
  // but takes the input as a string.
  // so, you need to pass the unique number as a String itself
  // when you take the input.
  // This function is built because the person might enter a number who does not exist yet
  public boolean validate(String s) {
    // first, i'll check, if the text is a number or not.
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {} else {
        return false;
      }
    }

    // yahan pe, I'll take the imput from the database
    // and check the maximum value from the column gsno and
    // if the given input number is greater, then return false ;

    int a = Integer.parseInt(s);
    int mn = 1;
    int mx = 0;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement st = con.createStatement();
      String sql = "select max(gsno) from temp ; ";

      ResultSet rs = st.executeQuery(sql);
      rs.next();

      mx = rs.getInt(1);

      if (a <= mx && a >= mn) {} else {
        return false;
      }
      con.close();
    } catch (ClassNotFoundException | SQLException e) {
      JOptionPane.showMessageDialog(
        null,
        "There is an error in Functions.validate in the first connection. Go Check there. \n" +
        e
      );
    }

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement st = con.createStatement();
      String sql = "select gsno from temp ;";

      Vector<Integer> Elements;
      Elements = new Vector();

      ResultSet rs = st.executeQuery(sql);
      //            rs.next() ;

      while (rs.next()) {
        Elements.add(rs.getInt(1));
      }

      boolean exists = false;

      for (int i = 0; i < Elements.size(); i++) {
        if (Elements.get(i) == a) {
          return true;
        }
      }
    } catch (ClassNotFoundException | SQLException e) {
      JOptionPane.showMessageDialog(
        null,
        "There is an error in Functions.validate() method. \n" + e
      );
    }

    return false;
  }

  // I seriously doubt what this function does
  //
  public void Display_serialno_name_mob() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(
        "select gsno, gname, gmob, garrdate, garrtime from Temp ; "
      );

      String output = "";

      while (rs.next()) {
        output +=
          rs.getInt(1) +
          "\t " +
          rs.getString(2) +
          "\t " +
          rs.getString(3) +
          "\t " +
          rs.getString(4) +
          "\t " +
          rs.getString(5) +
          " \n";
      }

      JOptionPane.showMessageDialog(null, output);

      con.close();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e);
    }
  }

  // prints all the required records from the database onto the gui output
  public void printallrecords() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("select * from Temp");

      while (rs.next()) {
        System.out.println(
          rs.getInt(1) +
          " " +
          rs.getString(2) +
          " " +
          rs.getString(3) +
          " " +
          rs.getString(4) +
          " " +
          rs.getString(5) +
          " " +
          rs.getString(6) +
          " " +
          rs.getString(7) +
          " " +
          rs.getString(8) +
          " " +
          rs.getString(9) +
          " " +
          rs.getString(10) +
          " " +
          rs.getString(11)
        );
      }

      con.close();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e);
    }
  }

  // it returns 003 for 3
  /// for the unique string, transaction number, this is necessary.
  // Haa, I need to build the unique transaction string for each person
  // as I was recommended by our HOD
  public String troy(int a) {
    int y = a;
    int nd = 0;
    while (y > 0) {
      y /= 10;
      nd++;
    }

    String ans = "";
    for (int i = 0; i < 3 - nd; i++) {
      ans += "0";
    }

    ans += a;

    return ans;
  }

  /// inserts all the records into the table
  // that have been taken as input in the Main_Page
  // This is the main part of the Main_Page .
  // It's the backbone of my project
  public void insert_a_record(
    String Name,
    String gender,
    String Organization,
    String city,
    String State,
    String pincode,
    String mobilenumber,
    String mail,
    String reason,
    String Recommendedby,
    String Department,
    String Basis,
    int numg,
    String rn
  ) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement stmt = con.createStatement();

      DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
      java.util.Date date = new java.util.Date();

      DateFormat dateFormat0 = new SimpleDateFormat("HH:mm");
      java.util.Date date0 = new java.util.Date();

      Functions f = new Functions();
      String hostelname = f.HostelName(rn);

      String sql =
        "Insert into temp(gname, ggen, gorg, gcity, gstate, gpin, gmob, gmail,greason,grecommendedby, grecdept, gbasis, gpcnt, groom, ghostel, garrdate, garrtime) values ( '";

      sql += Name + "', '";
      sql += gender + "', '";
      sql += Organization + "', '";
      sql += city + "', '";
      sql += State + "', '";
      sql += pincode + "', '";
      sql += mobilenumber + "', '";
      sql += mail + "', '";
      sql += reason + "', '";
      sql += Recommendedby + "', '";
      sql += Department + "', '";
      sql += Basis + "', ";
      sql += numg + ", '";
      sql += rn + "', '";
      sql += hostelname + "', '";
      sql += dateFormat.format(date) + "', '";
      sql += dateFormat0.format(date0);
      sql += "') ;";

      // System.out.println(sql) ;

      try {
        stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Record Updated Successfully !!");
      } catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(
          null,
          "There is something wrong with Updation Statement in Functions.java ln 823. \n\n" +
          e
        );
      }

      Statement st = con.createStatement();

      String q =
        "Select gsno from Temp where gname = '" +
        Name +
        "' and gmob = '" +
        mobilenumber +
        "' ;";
      // System.out.println(q) ;
      ResultSet rs = st.executeQuery(q);

      rs.next();
      int a = rs.getInt(1);

      String unique =
        dateFormat.format(date) + "-" + rn.charAt(0) + "-" + troy(a);

      String uni = "";
      for (int i = 0; i < unique.length(); i++) {
        if (unique.charAt(i) == '-') {} else {
          uni += unique.charAt(i);
        }
      }

      Statement r = con.createStatement();
      String t =
        "Update temp set younick = '" + uni + "' where gsno = " + a + " ; ";

      try {
        r.executeUpdate(t);
        JOptionPane.showMessageDialog(
          null,
          "Unique Identification String Updated Successfully !! "
        );
      } catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(
          null,
          "There is something wrong with Updation Statement in Functions.java ln 859 \n" +
          e
        );
      }

      JOptionPane.showMessageDialog(
        null,
        "Hi " +
        Name +
        ", Your Unique Identification Serial Number is : " +
        a +
        ". Remember it for future usage."
      );

      con.close();
    } catch (ClassNotFoundException | SQLException | HeadlessException e) {
      JOptionPane.showMessageDialog(null, "Functions ln 868\n" + e);
    }
  }

  // for the BackdateEntry.java pp
  public void insert_backdate_record(
    String Name,
    String gender,
    String Organization,
    String city,
    String State,
    String pincode,
    String mobilenumber,
    String mail,
    String reason,
    String Recommendedby,
    String Department,
    String Basis,
    int numg,
    String rn,
    String d
  ) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement stmt = con.createStatement();

      DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
      java.util.Date date = new java.util.Date();

      DateFormat dateFormat0 = new SimpleDateFormat("HH:mm");
      java.util.Date date0 = new java.util.Date();

      String tr = "06:00";

      Functions f = new Functions();
      String hostelname = f.HostelName(rn);

      String sql =
        "Insert into temp(gname, ggen, gorg, gcity, gstate, gpin, gmob, gmail,greason,grecommendedby, grecdept, gbasis, gpcnt, groom, ghostel, garrdate, garrtime) values ( '";

      sql += Name + "', '";
      sql += gender + "', '";
      sql += Organization + "', '";
      sql += city + "', '";
      sql += State + "', '";
      sql += pincode + "', '";
      sql += mobilenumber + "', '";
      sql += mail + "', '";
      sql += reason + "', '";
      sql += Recommendedby + "', '";
      sql += Department + "', '";
      sql += Basis + "', ";
      sql += numg + ", '";
      sql += rn + "', '";
      sql += hostelname + "', '";
      sql += d + "', '";
      sql += tr;
      sql += "') ;";

      // System.out.println(sql) ;

      try {
        stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Record Updated Successfully !!");
      } catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(
          null,
          "There is something wrong with Updation Statement in Functions.java ln 823. \n\n" +
          e
        );
      }

      Statement st = con.createStatement();

      String q =
        "Select gsno from Temp where gname = '" +
        Name +
        "' and gmob = '" +
        mobilenumber +
        "' ;";
      // System.out.println(q) ;
      ResultSet rs = st.executeQuery(q);

      rs.next();
      int a = rs.getInt(1);

      String unique = d + "-" + rn.charAt(0) + "-" + troy(a);

      String uni = "";
      for (int i = 0; i < unique.length(); i++) {
        if (unique.charAt(i) == '-' || unique.charAt(i) == ' ') {} else {
          uni += unique.charAt(i);
        }
      }

      Statement r = con.createStatement();
      String t =
        "Update temp set younick = '" + uni + "' where gsno = " + a + " ; ";

      try {
        r.executeUpdate(t);
        JOptionPane.showMessageDialog(
          null,
          "Unique Identification String Updated Successfully !! "
        );
      } catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(
          null,
          "There is something wrong with Updation Statement in Functions.java ln 859 \n" +
          e
        );
      }

      JOptionPane.showMessageDialog(
        null,
        "Hi " +
        Name +
        ", Your Unique Identification Serial Number is : " +
        a +
        ". Remember it for future usage."
      );

      con.close();
    } catch (ClassNotFoundException | SQLException | HeadlessException e) {
      JOptionPane.showMessageDialog(null, "Functions ln 868\n" + e);
    }
  }
  // Very Inportant Code . for copying everything in a text area to clipboard.
  //     jTextArea1.requestFocus();
  //        jTextArea1.selectAll() ;
  //        jTextArea1.copy() ;
  //

}
// End of Functions.java
