package boissons;

import decorateurs.Caramel;
import decorateurs.Cholcolat;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;


public class Test extends Application {
    AtomicReference<Boisson> b;

    public static void main(String[] args){
       /*Boisson b=new Expresso();
        System.out.println("**********************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("**********************");
        b=new Cholcolat(b);
        System.out.println(b.getDescription());
        System.out.println(b.cout()); */
        
        launch(args);

    }



    @Override
    public void start(Stage stage) throws Exception {

        BorderPane borderPane=new BorderPane();
        ImageView img = new ImageView("images/j1.jpg");
        ImageView img1 = new ImageView("images/deca.jpg");
        ImageView img2 = new ImageView("images/sumattra.jpg");
        img.setFitHeight(150);
        img.setFitWidth(200);
        img1.setFitHeight(150);
        img1.setFitWidth(200);
        img2.setFitHeight(150);
        img2.setFitWidth(200);
        img.setPickOnBounds(true); // allows click on transparent areas
        img1.setPickOnBounds(true); // allows click on transparent areas
        img2.setPickOnBounds(true); // allows click on transparent areas
        HBox hBox=new HBox();
        hBox.getChildren().addAll(img,img2,img1);
            ///////////////////////////Deca//////////////////////////////
        img1.setOnMouseClicked((MouseEvent e) -> {
            b= new AtomicReference<>(new Deca());

            ImageView ingrediant1 = new ImageView("images/chocolat.jpg");
            ImageView ingrediant2 = new ImageView("images/caramel.jpg");
            ingrediant1.setFitHeight(200);
            ingrediant1.setFitWidth(200);
            ingrediant2.setFitHeight(200);
            ingrediant2.setFitWidth(200);
            ingrediant1.setPickOnBounds(true); // allows click on transparent areas
            ingrediant2.setPickOnBounds(true);
            HBox hBox2=new HBox();
            HBox hBox3=new HBox();
            hBox2.getChildren().addAll(ingrediant1,ingrediant2);


            Text t1=new Text("");

            ingrediant1.setOnMouseClicked((MouseEvent e1) -> {
                b.set(new Cholcolat(b.get()));

                System.out.println("chocolate son cout : "+b.get().cout());
                t1.setText("cout:__"+b.get().cout() + "DH__description:__"+b.get().getDescription());

            });


            ingrediant2.setOnMouseClicked((MouseEvent e2) -> {

                b.set(new Caramel(b.get()));
                System.out.println("caramel son cout : "+b.get().cout());
                t1.setText("cout:__"+b.get().cout() + "DH__description:__"+b.get().getDescription());
            });

            hBox3.getChildren().add(t1);

            borderPane.setCenter(hBox2);
            borderPane.setCenter(hBox3);

        });


        //////////////////////////////////////////////////////////////////////////////////////////////////

        img1.setOnMouseClicked((MouseEvent e) -> {
            b= new AtomicReference<>(new Deca());

            ImageView ingrediant1 = new ImageView("images/chocolat.jpg");
            ImageView ingrediant2 = new ImageView("images/caramel.jpg");
            ingrediant1.setFitHeight(200);
            ingrediant1.setFitWidth(200);
            ingrediant2.setFitHeight(200);
            ingrediant2.setFitWidth(200);
            ingrediant1.setPickOnBounds(true); // allows click on transparent areas
            ingrediant2.setPickOnBounds(true);
            HBox hBox2=new HBox();
            HBox hBox3=new HBox();
            hBox2.getChildren().addAll(ingrediant1,ingrediant2);


            Text t1=new Text("");

             ingrediant1.setOnMouseClicked((MouseEvent e1) -> {
                b.set(new Cholcolat(b.get()));
                System.out.println("chocolate son cout : "+b.get().cout());
                t1.setText("cout:__"+b.get().cout() + "DH__description:__"+b.get().getDescription());

            });


            ingrediant2.setOnMouseClicked((MouseEvent e2) -> {

                b.set(new Caramel(b.get()));
                System.out.println("caramel son cout : "+b.get().cout()+" sa quantite : ");
                t1.setText("cout:__"+b.get().cout() + "DH__description:__"+b.get().getDescription());

            });

                    hBox3.getChildren().add(t1);

                    borderPane.setCenter(hBox2);
                    borderPane.setBottom(hBox3);

        });



        /////////////////////////////////////////////Sumattra/////////////////////////////////////////////////////

        img1.setOnMouseClicked((MouseEvent e) -> {
            b= new AtomicReference<>(new Sumattra());

            ImageView ingrediant1 = new ImageView("images/chocolat.jpg");
            ImageView ingrediant2 = new ImageView("images/caramel.jpg");
            ingrediant1.setFitHeight(200);
            ingrediant1.setFitWidth(200);
            ingrediant2.setFitHeight(200);
            ingrediant2.setFitWidth(200);
            ingrediant1.setPickOnBounds(true); // allows click on transparent areas
            ingrediant2.setPickOnBounds(true);
            HBox hBox2=new HBox();
            HBox hBox3=new HBox();
            hBox2.getChildren().addAll(ingrediant1,ingrediant2);


            Text t1=new Text("");

            ingrediant1.setOnMouseClicked((MouseEvent e1) -> {
                b.set(new Cholcolat(b.get()));
                System.out.println("chocolate son cout : "+b.get().cout());
                t1.setText("cout:__"+b.get().cout() + "DH__description:__"+b.get().getDescription());
            });


            ingrediant2.setOnMouseClicked((MouseEvent e2) -> {

                b.set(new Caramel(b.get()));
                System.out.println("caramel son cout : "+b.get().cout());
                t1.setText("cout:__"+b.get().cout() + "DH__description:__"+b.get().getDescription());
            });

            hBox3.getChildren().add(t1);

            borderPane.setCenter(hBox2);
            borderPane.setBottom(hBox3);

        });



        borderPane.setTop(hBox);


        Scene scene = new Scene(borderPane,600,450);
        stage.setTitle("Café des Boissons");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();

    }


}
