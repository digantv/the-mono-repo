package user_add;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class UserAddScreen {
  public static void showUserAddScreen() throws Exception {
    try {

      Parent actorGroup = FXMLLoader.load(
          new URL(
              "file:///C:\\\\SGTek\\\\/hospital-console-fxml/src/main/java/user_add/AddUserScreen.fxml"));
      StageFactory.stage.setTitle("Customer Login");
      Scene scene = new Scene(actorGroup, 1270, 750);
      StageFactory.stage.setScene(scene);
      StageFactory.stage.setFullScreen(false);
      StageFactory.stage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
