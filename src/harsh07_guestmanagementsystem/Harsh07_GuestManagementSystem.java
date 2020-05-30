package harsh07_guestmanagementsystem;

import java.awt.*;
import java.sql.*;
import java.text.*;
// Importing the required libraries
import java.util.*;
import javax.swing.*;
import javax.swing.UIManager.*;

/**
 *
 * @author harsh-0706
 */
public class Harsh07_GuestManagementSystem {

  public static void main(String[] args) {
    try {
      for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (
      ClassNotFoundException
      | InstantiationException
      | IllegalAccessException
      | UnsupportedLookAndFeelException e
    ) {
      // If Nimbus is not available, fall back to cross-platform
      try {
        UIManager.setLookAndFeel(
          UIManager.getCrossPlatformLookAndFeelClassName()
        );
      } catch (Exception ex) {
        // not worth my time
      }
    }

    FirstPage f = new FirstPage();
    f.setVisible(true);
  }
}
