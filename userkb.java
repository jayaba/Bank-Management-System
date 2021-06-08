package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class userkb {
    public static Pane keyboard(TextField txt1, Pane normalpane) {
        Pane userpane = new Pane();
        userpane.setLayoutX(300);
        userpane.setLayoutY(25);
        userpane.setPrefWidth(200);
        userpane.setPrefHeight(120);



        Button but1 = new Button("1");
        but1.setLayoutX(200);
        but1.setLayoutY(140);
        but1.setPrefSize(40, 20);
        but1.setStyle("-fx-background-color: aqua");
        but1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("1");
            }
        });


        Button but2 = new Button("2");
        but2.setLayoutX(245);
        but2.setLayoutY(140);
        but2.setPrefSize(40, 20);
        but2.setStyle("-fx-background-color:aqua");
        but2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("2");
            }
        });

        Button but3 = new Button("3");
        but3.setLayoutX(290);
        but3.setLayoutY(140);
        but3.setPrefSize(40, 20);
        but3.setStyle("-fx-background-color:aqua");
        but3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("3");
            }
        });

        Button but4 = new Button("4");
        but4.setLayoutX(200);
        but4.setLayoutY(180);
        but4.setPrefSize(40, 20);
        but4.setStyle("-fx-background-color:aqua");
        but4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("4");
            }
        });

        Button but5 = new Button("5");
        but5.setLayoutX(245);
        but5.setLayoutY(180);
        but5.setPrefSize(40, 20);
        but5.setStyle("-fx-background-color:aqua");
        but5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("5");
            }
        });

        Button but6 = new Button("6");
        but6.setLayoutX(290);
        but6.setLayoutY(180);
        but6.setPrefSize(40, 20);
        but6.setStyle("-fx-background-color:aqua");
        but6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("6");
            }
        });

        Button but7 = new Button("7");
        but7.setLayoutX(200);
        but7.setLayoutY(220);
        but7.setPrefSize(40, 20);
        but7.setStyle("-fx-background-color:aqua");
        but7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) { txt1.appendText("7");
            }
        });

        Button but8 = new Button("8");
        but8.setLayoutX(245);
        but8.setLayoutY(220);
        but8.setPrefSize(40, 20);
        but8.setStyle("-fx-background-color:aqua");
        but8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("8");
            }
        });

        Button but9 = new Button("9");
        but9.setLayoutX(290);
        but9.setLayoutY(220);
        but9.setPrefSize(40, 20);
        but9.setStyle("-fx-background-color:aqua");
        but9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("9");
            }
        });

        Button but10 = new Button(".");
        but10.setLayoutX(200);
        but10.setLayoutY(220);
        but10.setPrefSize(40, 20);
        but10.setStyle("-fx-background-color:aqua");
        but10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText(".");
            }
        });

        Button but11 = new Button("0");
        but11.setLayoutX(245);
        but11.setLayoutY(220);
        but11.setPrefSize(40, 20);
        but11.setStyle("-fx-background-color:aqua");
        but11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("0");
            }
        });

        Button but12 = new Button("C");
        but12.setLayoutX(290);
        but12.setLayoutY(220);
        but12.setPrefSize(40, 20);
        but12.setStyle("-fx-background-color:aqua");
        but12.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                txt1.setText(txt1.getText().substring(0,txt1.getText().length() - 1));
            }
        });


        //action_1
        but1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("1");
            }
        });
        //action_2
        but2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("2");
            }
        });
        //action_3
        but3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("3");
            }
        });
        //action_4
        but4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.appendText("4");
            }
        });

         //action5
          but5.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.appendText("5");
                    }
                });
          //action_6
          but6.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.appendText("6");
                    }
                });
         //action_7
          but7.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.appendText("7");
                    }
                });
         //action_8
          but8.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.appendText("8");
                    }
                });
         //action9
          but9.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.appendText("9");
                    }
                });
          but10.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.appendText(".");
                    }
                });
          but11.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.appendText("0");
                    }
                });
          but12.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText().substring(0,txt1.getText().length()-1));
                    }
                });


          userpane.getChildren().addAll(but1, but2, but3, but4, but5, but6, but7, but8, but9, but10, but11, but12);
          return userpane;


            }

        }