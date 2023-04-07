package ch12.ex5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ScrapbookingAppController {

    @FXML
    private ImageView imageView00;

    @FXML
    private ImageView imageView01;

    @FXML
    private ImageView imageView10;

    @FXML
    private ImageView imageView11;

    @FXML
    private Label label00;

    @FXML
    private Label label01;

    @FXML
    private Label label10;

    @FXML
    private Label label11;
    public void initialize() {
        imageView00.setImage(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/FullMoon2010.jpg/1200px-FullMoon2010.jpg"));
        label00.setText("Lua");

        imageView11.setImage(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Bangabandhu_Satellite-1_Mission_%2842025499722%29.jpg/270px-Bangabandhu_Satellite-1_Mission_%2842025499722%29.jpg"));
        label11.setText("Falcon 9");

        imageView01.setImage(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/International_Space_Station_after_undocking_of_STS-132.jpg/1024px-International_Space_Station_after_undocking_of_STS-132.jpg"));
        label01.setText("Base Espacial Internacional");

        imageView10.setImage(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Aldrin_Apollo_11_original.jpg/800px-Aldrin_Apollo_11_original.jpg"));
        label10.setText("Missão Apollo 11");
    }
}
