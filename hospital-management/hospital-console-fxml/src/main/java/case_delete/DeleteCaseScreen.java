package case_delete;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DeleteCaseScreen {
  public static void showCaseDeleteScreen() throws Exception {
    try {

      Parent actorGroup = FXMLLoader.load(
          new URL(
              "file:///C:\\\\SGTek\\\\/hospital-console-fxml/src/main/java/case_delete/DeleteCase.fxml"));
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
