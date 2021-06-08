package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main extends Application {

    Scene scene1,scene2,scene3,scene4,scene5,scene6,scene7;
    DecimalFormat d_format=new DecimalFormat("0.00");


    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Online banking");


        Image home_image=new Image("first.jpg");
        ImageView first_image=new ImageView();
        first_image.setImage(home_image);
        first_image.setFitWidth(660);
        first_image.setFitHeight(560);


        Label lb1=new Label("HOME PAGE");
        lb1.setLayoutX(245);
        lb1.setLayoutY(50);
        lb1.setStyle("-fx-font-size:35;-fx-alignment: center");


        Button bt1=new Button("fixed deposit");
        bt1.setLayoutX(260);
        bt1.setLayoutY(150);
        bt1.setPrefWidth(170);
        bt1.setPrefHeight(40);
        bt1.setOnAction(event -> primaryStage.setScene(scene2));

        Button bt2=new Button("Saving");
        bt2.setLayoutX(260);
        bt2.setLayoutY(250);
        bt2.setPrefWidth(170);
        bt2.setPrefHeight(40);
        bt2.setOnAction(event -> primaryStage.setScene(scene3));

        Button bt3=new Button("Loans");
        bt3.setLayoutX(260);
        bt3.setLayoutY(350);
        bt3.setPrefWidth(170);
        bt3.setPrefHeight(40);
        bt3.setOnAction(event -> primaryStage.setScene(scene4));

        Button bt4=new Button("Mortgage");
        bt4.setLayoutX(260);
        bt4.setLayoutY(450);
        bt4.setPrefWidth(170);
        bt4.setPrefHeight(40);
        bt4.setOnAction(event -> primaryStage.setScene(scene5));

        Button bt5=new Button("EXIT");
        bt5.setLayoutX(540);
        bt5.setLayoutY(500);
        bt5.setPrefWidth(100);
        bt5.setPrefHeight(40);
        bt5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage1=(Stage)bt5.getScene().getWindow();
                stage1.close();
            }
        });

        Button bt6=new Button("HELP");
        bt6.setLayoutX(11);
        bt6.setLayoutY(492);
        bt6.setPrefWidth(100);
        bt6.setPrefHeight(40);
        bt6.setOnAction(event -> primaryStage.setScene(scene6));

//***********************************************************************************history botton
        Pane root7=new Pane();

        TextArea ta2=new TextArea();

        ta2.setLayoutX(100);

        ta2.setPrefWidth(500);
        ta2.setPrefHeight(550);

        Button btn2=new Button("Go Back");
        btn2.setLayoutX(7);
        btn2.setLayoutY(500);
        btn2.setPrefWidth(80);
        btn2.setPrefHeight(40);
        btn2.setOnAction(event -> primaryStage.setScene(scene1));




        root7.getChildren().addAll(ta2,btn2);

        scene7=(new Scene(root7,650,560));



        Button btn1=new Button("History");
        btn1.setLayoutX(540);
        btn1.setLayoutY(450);
        btn1.setPrefWidth(100);
        btn1.setPrefHeight(40);
        btn1.setOnAction(event -> {
            primaryStage.setScene(scene7);
            textfile1(ta2);
        });







        Pane root1=new Pane();
        root1.getChildren().addAll(first_image,lb1,bt1,bt2,bt3,bt4,bt5,bt6,btn1);
        scene1=(new Scene(root1, 650, 560));
        primaryStage.setScene(scene1);
        primaryStage.show();

        //-----------------------------------------------------------------------------saving
        Image saving_image=new Image("third.jpg");
        ImageView third_image=new ImageView();
        third_image.setImage(saving_image);
        third_image.setFitWidth(660);
        third_image.setFitHeight(560);

        Label lb8=new Label("Saving");
        lb8.setLayoutX(245);
        lb8.setLayoutY(50);
        lb8.setStyle("-fx-font-size:50;-fx-alignment: center");

        Label lb9=new Label("Principle amount");
        lb9.setLayoutX(20);
        lb9.setLayoutY(140);

        TextField tx6=new TextField();
        tx6.setLayoutX(140);
        tx6.setLayoutY(133);
        tx6.setPrefWidth(180);
        tx6.setPrefHeight(15);

        Label lb10=new Label("Interest Rate");
        lb10.setLayoutX(20);
        lb10.setLayoutY(200);

        TextField tx7=new TextField();
        tx7.setLayoutX(140);
        tx7.setLayoutY(193);
        tx7.setPrefWidth(180);
        tx7.setPrefHeight(15);

        Label lb11=new Label("Number of Month");
        lb11.setLayoutX(20);
        lb11.setLayoutY(260);

        TextField tx8=new TextField();
        tx8.setLayoutX(140);
        tx8.setLayoutY(253);
        tx8.setPrefWidth(180);
        tx8.setPrefHeight(15);

        Label lb12=new Label("Monthly Payment");
        lb12.setLayoutX(20);
        lb12.setLayoutY(320);

        Label lbl1=new Label("Future Value");
        lbl1.setLayoutX(20);
        lbl1.setLayoutY(373);

        TextField txtf1=new TextField();
        txtf1.setLayoutX(140);
        txtf1.setLayoutY(373);
        txtf1.setPrefWidth(180);
        txtf1.setPrefHeight(15);


        TextField tx9=new TextField();
        tx9.setLayoutX(142);
        tx9.setLayoutY(313);
        tx9.setPrefWidth(180);
        tx9.setPrefHeight(15);

        Button bt9=new Button("Go Back");
        bt9.setLayoutX(11);
        bt9.setLayoutY(492);
        bt9.setPrefWidth(100);
        bt9.setPrefHeight(40);
        bt9.setOnAction(event -> primaryStage.setScene(scene1));

        Button bt10=new Button("Calculate");
        bt10.setLayoutX(540);
        bt10.setLayoutY(500);
        bt10.setPrefWidth(100);
        bt10.setPrefHeight(40);

        bt10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double pas=Double.parseDouble(tx6.getText());//principle amount
                double is=Double.parseDouble(tx7.getText())/100;//interest rate saving
                double noms=Double.parseDouble(tx8.getText())/12;//number of months saving
                double mps=Double.parseDouble(tx9.getText());//monthly payment saving
                double fvs1=mps*(((Math.pow(1+is/12,12*noms))-1)/(is/12));
                double fvs2=pas*(Math.pow(1+is/12,12*noms));
                double fvs3=fvs1+fvs2;
                txtf1.setText(d_format.format(fvs3));
                filesadd1(tx6,tx7,tx8,txtf1,tx9,"Principle amount","Interest Rate","Number of Month","Monthly Payment","Future Value","Saving");

            }
        });

        


        Pane root3=new Pane();


        tx6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root3.getChildren().addAll(userkb.keyboard(tx6,root3));

            }
        });

        tx7.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root3.getChildren().addAll(userkb.keyboard(tx7,root3));

            }
        });

        tx8.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root3.getChildren().addAll(userkb.keyboard(tx8,root3));

            }
        });

        txtf1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root3.getChildren().addAll(userkb.keyboard(txtf1,root3));

            }
        });

        tx9.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root3.getChildren().addAll(userkb.keyboard(tx9,root3));

            }
        });








        root3.getChildren().addAll(third_image,lb8,lb9,lb10,lb11,lb12,tx6,tx7,tx8,tx9,bt9,bt10,lbl1,txtf1);
        scene3=(new Scene(root3, 650, 560));

        //------------(Fixed deposit)

        Image fixed_image=new Image("second.jpg");
        ImageView second_image=new ImageView();
        second_image.setImage(fixed_image);
        second_image.setFitWidth(660);
        second_image.setFitHeight(560);


        Label lb2=new Label("Fixed Deposit");
        lb2.setLayoutX(245);
        lb2.setLayoutY(50);
        lb2.setStyle("-fx-font-size:35;-fx-alignment: center");

        Label lb3=new Label("Principle Amount");
        lb3.setLayoutX(20);
        lb3.setLayoutY(130);

        TextField tx1=new TextField();
        tx1.setLayoutX(140);
        tx1.setLayoutY(120);
        tx1.setPrefWidth(180);
        tx1.setPrefHeight(15);



        Label lb4=new Label("Interest Rate");
        lb4.setLayoutX(20);
        lb4.setLayoutY(180);

        TextField tx2=new TextField();
        tx2.setLayoutX(140);
        tx2.setLayoutY(170);
        tx2.setPrefWidth(180);
        tx2.setPrefHeight(15);


        Label lb5=new Label("Number of month");
        lb5.setLayoutX(20);
        lb5.setLayoutY(230);

        TextField tx3=new TextField();
        tx3.setLayoutX(140);
        tx3.setLayoutY(220);
        tx3.setPrefWidth(180);
        tx3.setPrefHeight(15);

        Label lb6=new Label("Future Value");
        lb6.setLayoutX(20);
        lb6.setLayoutY(280);

        TextField tx4=new TextField();
        tx4.setLayoutX(140);
        tx4.setLayoutY(270);
        tx4.setPrefWidth(180);
        tx4.setPrefHeight(15);



        Button bt7=new Button("Calculate");
        bt7.setLayoutX(530);
        bt7.setLayoutY(490);
        bt7.setPrefWidth(100);
        bt7.setPrefHeight(40);
        bt7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double pa=Double.parseDouble(tx1.getText()); //principle amount
                double i=Double.parseDouble(tx2.getText())/100;//interest Rate
                double nom=Double.parseDouble(tx3.getText())/12;//Number of months
                double fv=pa*(Math.pow(1+i/12,12*nom));
                tx4.setText(d_format.format(fv));
                filesadd(tx1,tx2,tx3,tx4,"principle value","Interest Rate","Number of month","Future Value","fixed deposit");
            }
        });

        Button bt8=new Button("Go Back");
        bt8.setLayoutX(11);
        bt8.setLayoutY(492);
        bt8.setPrefWidth(100);
        bt8.setPrefHeight(40);
        bt8.setOnAction(event -> primaryStage.setScene(scene1));



        Pane root2=new Pane();
        //1txt
        tx1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root2.getChildren().addAll(userkb.keyboard(tx1,root2));
            }
        });
        //2txt
        tx2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root2.getChildren().addAll(userkb.keyboard(tx2,root2));
            }
        });

        tx3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root2.getChildren().addAll(userkb.keyboard(tx3,root2));

            }
        });

        tx4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root2.getChildren().addAll(userkb.keyboard(tx4,root2));

            }
        });










        root2.getChildren().addAll(second_image,lb2,lb3,lb4,lb5,lb6,tx1,tx2,tx3,tx4,bt7,bt8);
        scene2=(new Scene(root2, 650, 560));





        //---------------------------------------------Loans

        Image loan_image=new Image("fourth.jpeg");
        ImageView fourth_image=new ImageView();
        fourth_image.setImage(loan_image);
        fourth_image.setFitWidth(660);
        fourth_image.setFitHeight(560);

        Label lb13=new Label("Loans");
        lb13.setLayoutX(245);
        lb13.setLayoutY(40);
        lb13.setStyle("-fx-font-size:45;-fx-alignment: center");

        Label lb14=new Label("Principle amount");
        lb14.setLayoutX(20);
        lb14.setLayoutY(140);

        TextField tx10=new TextField();
        tx10.setLayoutX(170);
        tx10.setLayoutY(133);
        tx10.setPrefWidth(290);
        tx10.setPrefHeight(15);

        Label lb15=new Label("Interest Rate");
        lb15.setLayoutX(20);
        lb15.setLayoutY(210);

        TextField tx11=new TextField();
        tx11.setLayoutX(170);
        tx11.setLayoutY(203);
        tx11.setPrefWidth(290);
        tx11.setPrefHeight(15);

        Label lb16=new Label("Number Of Month");
        lb16.setLayoutX(20);
        lb16.setLayoutY(287);

        TextField tx12=new TextField();
        tx12.setLayoutX(170);
        tx12.setLayoutY(280);
        tx12.setPrefWidth(290);
        tx12.setPrefHeight(15);

        Label lb17=new Label("Monthly Payment");
        lb17.setLayoutX(20);
        lb17.setLayoutY(360);

        TextField tx13=new TextField();
        tx13.setLayoutX(170);
        tx13.setLayoutY(355);
        tx13.setPrefWidth(290);
        tx13.setPrefHeight(15);

        Button bt11=new Button("Go Back");
        bt11.setLayoutX(11);
        bt11.setLayoutY(492);
        bt11.setPrefWidth(100);
        bt11.setPrefHeight(40);
        bt11.setOnAction(event -> primaryStage.setScene(scene1));

        Button bt12=new Button("Calculate");
        bt12.setLayoutX(540);
        bt12.setLayoutY(500);
        bt12.setPrefWidth(100);
        bt12.setPrefHeight(40);



        bt12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double paL=Double.parseDouble(tx10.getText());//principle amount loan
                double irL=Double.parseDouble(tx11.getText())/100;//interest rate loans
                double nomL=Double.parseDouble(tx12.getText())/12;//number of months loan
                double a=Math.pow(1+(irL/12),(nomL*12));
                double b=paL*(irL/12);
                double c=a*b;
                double d=a-1;
                double e=c/d;
                double mpL=(e*100)/100;
                tx13.setText(d_format.format(mpL));
                filesadd(tx10,tx11,tx12,tx13,"Principle amount","Interest Rate","Number Of Month","Monthly Payment","Loans");


            }
        });










        Pane root4=new Pane();

        tx10.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root4.getChildren().addAll(userkb.keyboard(tx10,root4));

            }
        });

        tx11.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root4.getChildren().addAll(userkb.keyboard(tx11,root4));

            }
        });

        tx12.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root4.getChildren().addAll(userkb.keyboard(tx12,root4));

            }
        });

        tx13.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root4.getChildren().addAll(userkb.keyboard(tx13,root4));

            }
        });











        root4.getChildren().addAll(fourth_image,lb13,lb14,tx10,lb15,tx11,lb16,tx12,tx13,lb17,bt11,bt12);
        scene4=(new Scene(root4, 650, 560));


        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^mortgage

        Image mortgage_image=new Image("fifth.jpg");
        ImageView fifth_image=new ImageView();
        fifth_image.setImage(mortgage_image);
        fifth_image.setFitWidth(660);
        fifth_image.setFitHeight(560);

        Label lb18=new Label("Mortgage");
        lb18.setLayoutX(225);
        lb18.setLayoutY(30);
        lb18.setStyle("-fx-font-size:45;-fx-alignment: center");

        Label lb19=new Label("Principle amount");
        lb19.setLayoutX(20);
        lb19.setLayoutY(110);

        TextField tx14=new TextField();
        tx14.setLayoutX(170);
        tx14.setLayoutY(105);
        tx14.setPrefWidth(290);
        tx14.setPrefHeight(15);

        Label lb20=new Label("Down Payment");
        lb20.setLayoutX(20);
        lb20.setLayoutY(170);

        TextField tx15=new TextField();
        tx15.setLayoutX(170);
        tx15.setLayoutY(165);
        tx15.setPrefWidth(290);
        tx15.setPrefHeight(15);


        Label lb21=new Label("Interest Rate");
        lb21.setLayoutX(20);
        lb21.setLayoutY(230);

        TextField tx16=new TextField();
        tx16.setLayoutX(170);
        tx16.setLayoutY(225);
        tx16.setPrefWidth(290);
        tx16.setPrefHeight(15);

        Label lb22=new Label("Number Of Month");
        lb22.setLayoutX(20);
        lb22.setLayoutY(285);

        TextField tx17=new TextField();
        tx17.setLayoutX(170);
        tx17.setLayoutY(280);
        tx17.setPrefWidth(290);
        tx17.setPrefHeight(15);

        Label lble23=new Label("Monthly Payment");
        lble23.setLayoutX(20);
        lble23.setLayoutY(355);

        TextField tx18= new TextField();
        tx18.setLayoutX(170);
        tx18.setLayoutY(350);
        tx18.setPrefWidth(290);
        tx18.setPrefHeight(15);

        Button bt13=new Button("Go Back");
        bt13.setLayoutX(11);
        bt13.setLayoutY(492);
        bt13.setPrefWidth(100);
        bt13.setPrefHeight(40);
        bt13.setOnAction(event -> primaryStage.setScene(scene1));

        Button bt14=new Button("Calculate");
        bt14.setLayoutX(540);
        bt14.setLayoutY(500);
        bt14.setPrefWidth(100);
        bt14.setPrefHeight(40);

        bt14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double paM=Double.parseDouble(tx14.getText());
                double nomM=Double.parseDouble(tx17.getText())/12;
                double iM=Double.parseDouble(tx16.getText())/100;

                double dpM=Double.parseDouble(tx15.getText());

           double a=((paM-dpM)*(iM/12)*Math.pow(1+(iM/12),nomM*12));
           double b=(Math.pow(1+(iM/12),nomM*12)-1);
           double c=a/b;
           tx18.setText(d_format.format(c));

           filesadd1(tx14,tx15,tx16,tx17,tx18,"Principle amount","Down Payment","Interest Rate","Number Of Month","Monthly Payment","Mortgage");
            }
        });









        Pane root5=new Pane();

        tx14.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root5.getChildren().addAll(userkb.keyboard(tx14,root5));

            }
        });

        tx15.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root5.getChildren().addAll(userkb.keyboard(tx15,root5));

            }
        });

        tx16.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root5.getChildren().addAll(userkb.keyboard(tx16,root5));

            }
        });

        tx17.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root5.getChildren().addAll(userkb.keyboard(tx17,root5));

            }
        });

        tx18.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {root5.getChildren().addAll(userkb.keyboard(tx18,root5));

            }
        });





        root5.getChildren().addAll(fifth_image,lb18,lb19,tx14,lb20,tx15,lb21,tx16,lb22,tx17,bt13,bt14,lble23,tx18);
        scene5=(new Scene(root5, 650, 560));

        //--------------------help

        Image help_image=new Image("help1.jpg");
        ImageView six_image=new ImageView();
        six_image.setImage(help_image);
        six_image.setFitWidth(650);
        six_image.setFitHeight(560);

 ;



        Button bt16=new Button("Go Back");
        bt16.setLayoutX(35);
        bt16.setLayoutY(455);
        bt16.setOnAction(event -> primaryStage.setScene(scene1));



        Pane root6=new Pane();




        root6.getChildren().addAll(six_image,bt16);
        scene6=(new Scene(root6, 650, 560));



    }



    //4textfield file adding
    public void filesadd(TextField t_x1 , TextField t_x2, TextField t_x3, TextField t_x4, String st1, String st2, String st3, String st4, String st5) {
        File newfile = new File("history1.txt");
        PrintWriter printWrite;
        FileWriter fileWrite;
        try {
            fileWrite = new FileWriter(newfile, true);
            printWrite = new PrintWriter(fileWrite, true);


            printWrite.println(st5);
            printWrite.println(st1 + "=" + t_x1.getText());
            printWrite.println(st2 + "=" + t_x2.getText());
            printWrite.println(st3 + "=" + t_x3.getText());
            printWrite.println(st4 + "=" + t_x4.getText());
            printWrite.println("*****************************************");
            printWrite.close();

        } catch (IOException e) {
            System.out.println("error");

        }
    }
    //5Textfield file adding
    public void filesadd1(TextField t_x1 , TextField t_x2, TextField t_x3, TextField t_x4, TextField t_x5, String st1, String st2, String st3, String st4, String st5, String st6){
        File file=new File("history1.txt");
        PrintWriter printwrite;
        FileWriter fileswrite1;
        try{
            fileswrite1=new FileWriter(file,true);
            printwrite=new PrintWriter(fileswrite1,true);

            printwrite.println(st6);
            printwrite.println(st1+"="+t_x1.getText());
            printwrite.println(st2+"="+t_x2.getText());
            printwrite.println(st3+"="+t_x3.getText());
            printwrite.println(st4+"="+t_x4.getText());
            printwrite.println(st5+"="+t_x5.getText());
            printwrite.println("***************************************************");
            printwrite.close();

        }catch (IOException e){
            System.out.println("invalid");
        }
    }

    //displythetextfile

    public void textfile1(TextArea txtx1){

        try{
            FileReader file_r=new FileReader("history1.txt");
            BufferedReader br= new BufferedReader( file_r);

            String str;
            while ((str=br.readLine())!=null){
                String a=txtx1.getText();

                txtx1.setText(a+str+"\n");
            }
            br.close();
        }catch (IOException e){
            System.out.println("Unfunded file");
        }

    }
}