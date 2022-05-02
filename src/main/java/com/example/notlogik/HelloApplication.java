package com.example.notlogik;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) {
        stage.setResizable(false);

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setAlignment(Pos.TOP_CENTER);
        root.setStyle("-fx-background-color: linear-gradient(to top, #b4b4b4, #ffffff);");

        VBox vbox1 = new VBox();
        VBox vbox2 = new VBox();
        VBox vbox3 = new VBox();
        VBox vbox4 = new VBox();

        VBox vbox5 = new VBox();
        VBox vbox6 = new VBox();
        VBox vbox7 = new VBox();
        VBox vbox8 = new VBox();


        HBox hbox0 = new HBox();
        HBox play4hbox = new HBox();
        HBox hitmiss = new HBox();

        hbox0.setAlignment(Pos.CENTER);
        hbox0.setAlignment(Pos.BOTTOM_CENTER);


        VBox colors = new VBox();
        VBox cisla = new VBox();
        VBox textPravidla = new VBox();

        Button rules = new Button("pravidla");
        rules.setMinSize(20, 15);

        VBox more = new VBox();
        more.setAlignment(Pos.BOTTOM_LEFT);


        Label pravidla1 = new Label(" Upozornění: \n -barvy se neopakují \n -pokud zvolíte dvě stejné barvy, či nezvolíte žádnou barvu,\n  je to vaše chyba \n");
        pravidla1.setFont(new Font("", 18));

        Label pravidla2 = new Label("""
                Pravidla:\s
                Logik je hlavolamová hra, která se skládá z hrací desky, tlačítek osmi různých barev a menších tlačítek žluté\s
                a červené barvy. Pole pro velká tlačítka je velké 4x10 míst. Na levé straně od velkého pole jsou čtyři místa\s
                pro malé tlačítka. Princip hry je následující: Na začátku programu se vylosují 4 náhodné barvy, přičemž se\s
                žádná barva neopakuje. Vašim cílem je uhodnout všechny 4 barvy a to i na správné pozici. Po umístění vašeho\s
                prvního tipu vám program odpoví v šedém poli jiných tlačítek na levé straně následovně. Pokud jste trefili\s
                správnou barvu a zároveň i správnou pozici barvy, barva tlačítka se obarví na červenou. Uhodnete-li však\s
                pouze barvu, ale na špatné pozici, tlačítko se zbarví na žluto. Může se obarvit i více barev najednou podle toho,\s
                kolik barev uhodnete. Pozice šedých obarvených tlačítek neznázorňuje pozici, na které jste uhodli barvu či\s
                pozici i barvu. Žluté nebo červené odpovědi se zobrazují zprava doleva, tudíž nevíte, kde jste barvu trefili.\s
                Cílem hry je uhodnout všechny 4 barvy a pozice tlačítek vybrané náhodně při startu hry.
                Pokud tak neučiníte do deseti pokusů, prohrajete.""".indent(2));

        pravidla2.setFont(new Font("", 10));

        Button check = new Button("POTVRDIT");
        check.setMinSize(100, 100);
        check.setStyle("-fx-background-color: linear-gradient(to bottom, #94ff83, #11ff00);");
        check.setFont(new Font("", 20));

        Scene scene = new Scene(root);

        Stage rulesStage = new Stage();
        rulesStage.setResizable(false);

        stage.setResizable(false);
        stage.setWidth(450);
        stage.setHeight(400);
        stage.setTitle("LOGIK");
        stage.setScene(scene);

        Label label1 = new Label("LOGIK");
        label1.setFont(new Font("", 45));

        Label vysledky = new Label("");
        vysledky.setFont(new Font("", 20));

        Button restart = new Button("RESTARTOVAT");
        restart.setMinSize(20, 15);
        restart.setDisable(true);

        Label l1 = new Label(" 1");
        l1.setFont(new Font("", 16));
        l1.setTextFill(Color.web("#ff0000", 0.8));
        Label l2 = new Label(" 2");
        l2.setFont(new Font("", 16));
        Label l3 = new Label(" 3");
        l3.setFont(new Font("", 16));
        Label l4 = new Label(" 4");
        l4.setFont(new Font("", 16));
        Label l5 = new Label(" 5");
        l5.setFont(new Font("", 16));
        Label l6 = new Label(" 6");
        l6.setFont(new Font("", 16));
        Label l7 = new Label(" 7");
        l7.setFont(new Font("", 16));
        Label l8 = new Label(" 8");
        l8.setFont(new Font("", 16));
        Label l9 = new Label(" 9");
        l9.setFont(new Font("", 16));
        Label l10 = new Label("10");
        l10.setFont(new Font("", 16));


        Button button1 = new Button("   ");
        Button button2 = new Button("   ");
        Button button3 = new Button("   ");
        Button button4 = new Button("   ");
        Button button5 = new Button("   ");
        Button button6 = new Button("   ");
        Button button7 = new Button("   ");
        Button button8 = new Button("   ");
        Button button9 = new Button("   ");
        Button button10 = new Button("   ");

        Button button11 = new Button("   ");
        Button button12 = new Button("   ");
        Button button13 = new Button("   ");
        Button button14 = new Button("   ");
        Button button15 = new Button("   ");
        Button button16 = new Button("   ");
        Button button17 = new Button("   ");
        Button button18 = new Button("   ");
        Button button19 = new Button("   ");
        Button button20 = new Button("   ");

        Button button21 = new Button("   ");
        Button button22 = new Button("   ");
        Button button23 = new Button("   ");
        Button button24 = new Button("   ");
        Button button25 = new Button("   ");
        Button button26 = new Button("   ");
        Button button27 = new Button("   ");
        Button button28 = new Button("   ");
        Button button29 = new Button("   ");
        Button button30 = new Button("   ");

        Button button31 = new Button("   ");
        Button button32 = new Button("   ");
        Button button33 = new Button("   ");
        Button button34 = new Button("   ");
        Button button35 = new Button("   ");
        Button button36 = new Button("   ");
        Button button37 = new Button("   ");
        Button button38 = new Button("   ");
        Button button39 = new Button("   ");
        Button button40 = new Button("   ");

        /* hit matxch */
        Button button1d = new Button(" ");
        button1d.setStyle("-fx-background-color: #969696; ");
        Button button2d = new Button(" ");
        button2d.setStyle("-fx-background-color: #969696; ");
        Button button3d = new Button(" ");
        button3d.setStyle("-fx-background-color: #969696; ");
        Button button4d = new Button(" ");
        button4d.setStyle("-fx-background-color: #969696; ");
        Button button5d = new Button(" ");
        button5d.setStyle("-fx-background-color: #969696; ");
        Button button6d = new Button(" ");
        button6d.setStyle("-fx-background-color: #969696; ");
        Button button7d = new Button(" ");
        button7d.setStyle("-fx-background-color: #969696; ");
        Button button8d = new Button(" ");
        button8d.setStyle("-fx-background-color: #969696; ");
        Button button9d = new Button(" ");
        button9d.setStyle("-fx-background-color: #969696; ");
        Button button10d = new Button(" ");
        button10d.setStyle("-fx-background-color: #969696; ");

        Button button1e = new Button(" ");
        button1e.setStyle("-fx-background-color: #969696; ");
        Button button2e = new Button(" ");
        button2e.setStyle("-fx-background-color: #969696; ");
        Button button3e = new Button(" ");
        button3e.setStyle("-fx-background-color: #969696; ");
        Button button4e = new Button(" ");
        button4e.setStyle("-fx-background-color: #969696; ");
        Button button5e = new Button(" ");
        button5e.setStyle("-fx-background-color: #969696; ");
        Button button6e = new Button(" ");
        button6e.setStyle("-fx-background-color: #969696; ");
        Button button7e = new Button(" ");
        button7e.setStyle("-fx-background-color: #969696; ");
        Button button8e = new Button(" ");
        button8e.setStyle("-fx-background-color: #969696; ");
        Button button9e = new Button(" ");
        button9e.setStyle("-fx-background-color: #969696; ");
        Button button10e = new Button(" ");
        button10e.setStyle("-fx-background-color: #969696; ");

        Button button1f = new Button(" ");
        button1f.setStyle("-fx-background-color: #969696; ");
        Button button2f = new Button(" ");
        button2f.setStyle("-fx-background-color: #969696; ");
        Button button3f = new Button(" ");
        button3f.setStyle("-fx-background-color: #969696; ");
        Button button4f = new Button(" ");
        button4f.setStyle("-fx-background-color: #969696; ");
        Button button5f = new Button(" ");
        button5f.setStyle("-fx-background-color: #969696; ");
        Button button6f = new Button(" ");
        button6f.setStyle("-fx-background-color: #969696; ");
        Button button7f = new Button(" ");
        button7f.setStyle("-fx-background-color: #969696; ");
        Button button8f = new Button(" ");
        button8f.setStyle("-fx-background-color: #969696; ");
        Button button9f = new Button(" ");
        button9f.setStyle("-fx-background-color: #969696; ");
        Button button10f = new Button(" ");
        button10f.setStyle("-fx-background-color: #969696; ");

        Button button1g = new Button(" ");
        button1g.setStyle("-fx-background-color: #969696; ");
        Button button2g = new Button(" ");
        button2g.setStyle("-fx-background-color: #969696; ");
        Button button3g = new Button(" ");
        button3g.setStyle("-fx-background-color: #969696; ");
        Button button4g = new Button(" ");
        button4g.setStyle("-fx-background-color: #969696; ");
        Button button5g = new Button(" ");
        button5g.setStyle("-fx-background-color: #969696; ");
        Button button6g = new Button(" ");
        button6g.setStyle("-fx-background-color: #969696; ");
        Button button7g = new Button(" ");
        button7g.setStyle("-fx-background-color: #969696; ");
        Button button8g = new Button(" ");
        button8g.setStyle("-fx-background-color: #969696; ");
        Button button9g = new Button(" ");
        button9g.setStyle("-fx-background-color: #969696; ");
        Button button10g = new Button(" ");
        button10g.setStyle("-fx-background-color: #969696; ");


        //colooors
        Button col1 = new Button("barva 1");
        col1.setStyle("-fx-background-color: #494d54; ");
        Button col2 = new Button("barva 2");
        col2.setStyle("-fx-background-color: #009dff; ");
        Button col3 = new Button("barva 3");
        col3.setStyle("-fx-background-color: #940fe3; ");
        Button col4 = new Button("barva 4");
        col4.setStyle("-fx-background-color: #ff00c3; ");
        Button col5 = new Button("barva 5");
        col5.setStyle("-fx-background-color: #ff8800; ");
        Button col6 = new Button("barva 6");
        col6.setStyle("-fx-background-color: #00ff29; ");
        Button col7 = new Button("barva 7");
        col7.setStyle("-fx-background-color: #ffd500; ");
        Button col8 = new Button("barva 8");
        col8.setStyle("-fx-background-color: #ff0000; ");


        vbox1.getChildren().addAll(button1, button2, button3, button4, button5, button6, button7, button8, button9, button10);
        vbox2.getChildren().addAll(button11, button12, button13, button14, button15, button16, button17, button18, button19, button20);
        vbox3.getChildren().addAll(button21, button22, button23, button24, button25, button26, button27, button28, button29, button30);
        vbox4.getChildren().addAll(button31, button32, button33, button34, button35, button36, button37, button38, button39, button40);
        vbox5.getChildren().addAll(button1d, button2d, button3d, button4d, button5d, button6d, button7d, button8d, button9d, button10d);
        vbox6.getChildren().addAll(button1e, button2e, button3e, button4e, button5e, button6e, button7e, button8e, button9e, button10e);
        vbox7.getChildren().addAll(button1f, button2f, button3f, button4f, button5f, button6f, button7f, button8f, button9f, button10f);
        vbox8.getChildren().addAll(button1g, button2g, button3g, button4g, button5g, button6g, button7g, button8g, button9g, button10g);

        cisla.getChildren().addAll(l10, l9, l8, l7, l6, l5, l4, l3, l2, l1);
        hitmiss.getChildren().addAll(vbox5, vbox6, vbox7, vbox8);
        root.getChildren().addAll(label1, hbox0, vysledky);
        play4hbox.getChildren().addAll(vbox1, vbox2, vbox3, vbox4);
        hbox0.getChildren().addAll(colors, hitmiss, cisla, play4hbox, more);
        colors.getChildren().addAll(col1, col2, col3, col4, col5, col6, col7, col8);
        textPravidla.getChildren().addAll(pravidla1, pravidla2);
        more.getChildren().addAll(rules, restart, check);


                                                        //Logika programu


        rulesStage.setScene(new Scene(textPravidla, 503, 320));
        rulesStage.setX(1177);
        rulesStage.setY(213);

        rules.setOnAction(a -> {

            rulesStage.setTitle("PRAVIDLA");
            rulesStage.show();
        });

        restart.setOnAction(x -> start(stage));

        int min = 1;
        int max = 8;

        Random random = new Random();


        int barva1 = ThreadLocalRandom.current().nextInt(1, 8 + 1);
        int barva2 = ThreadLocalRandom.current().nextInt(1, 8 + 1);
        int barva3 = ThreadLocalRandom.current().nextInt(1, 8 + 1);
        int barva4 = ThreadLocalRandom.current().nextInt(1, 8 + 1);


        while (barva1 == barva2 || barva1 == barva3 || barva1 == barva4 || barva2 == barva3 || barva2 == barva4 || barva3 == barva4) {


            barva1 = random.nextInt(max + min);
            barva2 = random.nextInt(max + min);
            barva3 = random.nextInt(max + min);
            barva4 = random.nextInt(max + min);

            while(barva1 == 0 || barva2 == 0 || barva3 == 0 || barva4 ==0){
                barva1 = random.nextInt(max + min);
                barva2 = random.nextInt(max + min);
                barva3 = random.nextInt(max + min);
                barva4 = random.nextInt(max + min);
            }

        }

        System.out.println(barva1);
        System.out.println(barva2);
        System.out.println(barva3);
        System.out.println(barva4 + "\n");

        int finalBarva1 = barva1;
        int finalBarva2 = barva2;
        int finalBarva3 = barva3;
        int finalBarva4 = barva4;

        //nastaveni scaleZ 0.1
        scaleZ0(button1);
        scaleZ0(button2);
        scaleZ0(button3);
        scaleZ0(button4);
        scaleZ0(button5);
        scaleZ0(button6);
        scaleZ0(button7);
        scaleZ0(button8);
        scaleZ0(button9);
        scaleZ0(button10);
        scaleZ0(button11);
        scaleZ0(button12);
        scaleZ0(button13);
        scaleZ0(button14);
        scaleZ0(button15);
        scaleZ0(button16);
        scaleZ0(button17);
        scaleZ0(button18);
        scaleZ0(button19);
        scaleZ0(button20);
        scaleZ0(button21);
        scaleZ0(button22);
        scaleZ0(button23);
        scaleZ0(button24);
        scaleZ0(button25);
        scaleZ0(button26);
        scaleZ0(button27);
        scaleZ0(button28);
        scaleZ0(button29);
        scaleZ0(button30);
        scaleZ0(button31);
        scaleZ0(button32);
        scaleZ0(button33);
        scaleZ0(button34);
        scaleZ0(button35);
        scaleZ0(button36);
        scaleZ0(button37);
        scaleZ0(button38);
        scaleZ0(button39);
        scaleZ0(button40);

        //Změna barvy on POTVRDIT

        zmenBarvu(button10);
        zmenBarvu(button20);
        zmenBarvu(button30);
        zmenBarvu(button40);


        check.setOnAction(e -> {

            restart.setDisable(false);
            answer(finalBarva1, finalBarva2, finalBarva3, finalBarva4, button10, button20, button30, button40, button10d, button10e, button10f, button10g, label1, check, restart);

            zmenBarvu(button9);
            zmenBarvu(button19);
            zmenBarvu(button29);
            zmenBarvu(button39);

            zastavBarvu(button10);
            zastavBarvu(button20);
            zastavBarvu(button30);
            zastavBarvu(button40);

            l1.setTextFill(Color.web("#000000", 0.8));
            l2.setTextFill(Color.web("#ff0000", 0.8));

            check.setOnAction(f -> {

                answer(finalBarva1, finalBarva2, finalBarva3, finalBarva4, button9, button19, button29, button39, button9d, button9e, button9f, button9g, label1, check, restart);

                zmenBarvu(button8);
                zmenBarvu(button18);
                zmenBarvu(button28);
                zmenBarvu(button38);

                zastavBarvu(button9);
                zastavBarvu(button19);
                zastavBarvu(button29);
                zastavBarvu(button39);

                l2.setTextFill(Color.web("#000000", 0.8));
                l3.setTextFill(Color.web("#ff0000", 0.8));

                check.setOnAction(g -> {

                    answer(finalBarva1, finalBarva2, finalBarva3, finalBarva4, button8, button18, button28, button38, button8d, button8e, button8f, button8g, label1, check, restart);

                    zmenBarvu(button7);
                    zmenBarvu(button17);
                    zmenBarvu(button27);
                    zmenBarvu(button37);

                    zastavBarvu(button8);
                    zastavBarvu(button18);
                    zastavBarvu(button28);
                    zastavBarvu(button38);

                    l3.setTextFill(Color.web("#000000", 0.8));
                    l4.setTextFill(Color.web("#ff0000", 0.8));

                    check.setOnAction(h -> {

                        answer(finalBarva1, finalBarva2, finalBarva3, finalBarva4, button7, button17, button27, button37, button7d, button7e, button7f, button7g, label1, check, restart);

                        zmenBarvu(button6);
                        zmenBarvu(button16);
                        zmenBarvu(button26);
                        zmenBarvu(button36);

                        zastavBarvu(button7);
                        zastavBarvu(button17);
                        zastavBarvu(button27);
                        zastavBarvu(button37);

                        l4.setTextFill(Color.web("#000000", 0.8));
                        l5.setTextFill(Color.web("#ff0000", 0.8));

                        check.setOnAction(i -> {

                            answer(finalBarva1, finalBarva2, finalBarva3, finalBarva4, button6, button16, button26, button36, button6d, button6e, button6f, button6g, label1, check, restart);

                            zmenBarvu(button5);
                            zmenBarvu(button15);
                            zmenBarvu(button25);
                            zmenBarvu(button35);

                            zastavBarvu(button6);
                            zastavBarvu(button16);
                            zastavBarvu(button26);
                            zastavBarvu(button36);

                            l5.setTextFill(Color.web("#000000", 0.8));
                            l6.setTextFill(Color.web("#ff0000", 0.8));

                            check.setOnAction(j -> {

                                answer(finalBarva1, finalBarva2, finalBarva3, finalBarva4, button5, button15, button25, button35, button5d, button5e, button5f, button5g, label1, check, restart);

                                zmenBarvu(button4);
                                zmenBarvu(button14);
                                zmenBarvu(button24);
                                zmenBarvu(button34);

                                zastavBarvu(button5);
                                zastavBarvu(button15);
                                zastavBarvu(button25);
                                zastavBarvu(button35);

                                l6.setTextFill(Color.web("#000000", 0.8));
                                l7.setTextFill(Color.web("#ff0000", 0.8));

                                check.setOnAction(k -> {

                                    answer(finalBarva1, finalBarva2, finalBarva3, finalBarva4, button4, button14, button24, button34, button4d, button4e, button4f, button4g, label1, check, restart);

                                    zmenBarvu(button3);
                                    zmenBarvu(button13);
                                    zmenBarvu(button23);
                                    zmenBarvu(button33);

                                    zastavBarvu(button4);
                                    zastavBarvu(button14);
                                    zastavBarvu(button24);
                                    zastavBarvu(button34);

                                    l7.setTextFill(Color.web("#000000", 0.8));
                                    l8.setTextFill(Color.web("#ff0000", 0.8));

                                    check.setOnAction(l -> {

                                        answer(finalBarva1, finalBarva2, finalBarva3, finalBarva4, button3, button13, button23, button33, button3d, button3e, button3f, button3g, label1, check, restart);

                                        zmenBarvu(button2);
                                        zmenBarvu(button12);
                                        zmenBarvu(button22);
                                        zmenBarvu(button32);

                                        zastavBarvu(button3);
                                        zastavBarvu(button13);
                                        zastavBarvu(button23);
                                        zastavBarvu(button33);

                                        l8.setTextFill(Color.web("#000000", 0.8));
                                        l9.setTextFill(Color.web("#ff0000", 0.8));

                                        check.setOnAction(m -> {

                                            answer(finalBarva1, finalBarva2, finalBarva3, finalBarva4, button2, button12, button22, button32, button2d, button2e, button2f, button2g, label1, check, restart);

                                            zmenBarvu(button1);
                                            zmenBarvu(button11);
                                            zmenBarvu(button21);
                                            zmenBarvu(button31);

                                            zastavBarvu(button2);
                                            zastavBarvu(button12);
                                            zastavBarvu(button22);
                                            zastavBarvu(button32);

                                            l9.setTextFill(Color.web("#000000", 0.8));
                                            l10.setTextFill(Color.web("#ff0000", 0.8));

                                            check.setOnAction(n -> {

                                                lastAnswer(finalBarva1, finalBarva2, finalBarva3, finalBarva4, button1, button11, button21, button31, button1d, button1e, button1f, button1g, label1, check, restart, vysledky);

                                                zastavBarvu(button1);
                                                zastavBarvu(button11);
                                                zastavBarvu(button21);
                                                zastavBarvu(button31);

                                                l10.setTextFill(Color.web("#000000", 0.8));

                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });
                });
            });
        });

        stage.show();
    }

    public static void main(String[] args) {                //Main
        launch();
    }

    //Změna barvy

    public void zmenBarvu(Button button) {
        button.setOnAction(e -> {
            button.setStyle("-fx-background-color: #494d54; ");
            button.setScaleZ(1);

            button.setOnAction(f -> {
                button.setStyle("-fx-background-color: #009dff; ");
                button.setScaleZ(2);

                button.setOnAction(g -> {
                    button.setStyle("-fx-background-color: #940fe3; ");
                    button.setScaleZ(3);

                    button.setOnAction(h -> {
                        button.setStyle("-fx-background-color: #ff00c3; ");
                        button.setScaleZ(4);

                        button.setOnAction(i -> {
                            button.setStyle("-fx-background-color: #ff8800; ");
                            button.setScaleZ(5);

                            button.setOnAction(j -> {
                                button.setStyle("-fx-background-color: #00ff29; ");
                                button.setScaleZ(6);

                                button.setOnAction(k -> {
                                    button.setStyle("-fx-background-color: #ffd500; ");
                                    button.setScaleZ(7);

                                    button.setOnAction(l -> {
                                        button.setStyle("-fx-background-color: #ff0000; ");
                                        button.setScaleZ(8);

                                        zmenBarvu(button);
                                    });

                                });
                            });
                        });
                    });
                });
            });
        });
    }


    public void zastavBarvu(Button button) {
        button.setOnAction(l -> {

        });
    }

    public void answer(int barva1, int barva2, int barva3, int barva4, Button button1a, Button button2a, Button button3a, Button button4a, Button sedy1, Button sedy2, Button sedy3, Button sedy4, Label label1, Button check, Button restart) {

        double button1 = button1a.getScaleZ();
        double button2 = button2a.getScaleZ();
        double button3 = button3a.getScaleZ();
        double button4 = button4a.getScaleZ();

        if (barva1 == button1 && barva2 == button2 && barva3 == button3 && barva4 == button4) {
            sedy1.setStyle("-fx-background-color: #ff0000; ");
            sedy2.setStyle("-fx-background-color: #ff0000; ");
            sedy3.setStyle("-fx-background-color: #ff0000; ");
            sedy4.setStyle("-fx-background-color: #ff0000; ");

            label1.setText("Vyhráli jste");
            check.setStyle("-fx-background-color: #ffffff; ");
            check.setDisable(true);
            restart.setStyle("-fx-background-color: #00ff29; ");
        }

        if (barva1 == button1) {
            sedy4.setStyle("-fx-background-color: #ff0000; ");
            sedy4.setScaleZ(69);
        } else if (barva1 == button2 || barva1 == button3 || barva1 == button4) {
            sedy4.setStyle("-fx-background-color: #fff000; ");
            sedy4.setScaleZ(69);
        }


        if (barva2 == button2) {
            if (sedy4.getScaleZ() != 69) {
                sedy4.setStyle("-fx-background-color: #ff0000; ");
                sedy4.setScaleZ(69);
            } else if (sedy3.getScaleZ() != 69) {
                sedy3.setStyle("-fx-background-color: #ff0000; ");
                sedy3.setScaleZ(69);
            } else if (sedy2.getScaleZ() != 69) {
                sedy2.setStyle("-fx-background-color: #ff0000; ");
                sedy2.setScaleZ(69);
            } else {
                sedy1.setStyle("-fx-background-color: #ff0000; ");
            }

        } else if (barva2 == button1 || barva2 == button3 || barva2 == button4) {
            if (sedy4.getScaleZ() != 69) {
                sedy4.setStyle("-fx-background-color: #fff000; ");
                sedy4.setScaleZ(69);
            } else if (sedy3.getScaleZ() != 69) {
                sedy3.setStyle("-fx-background-color: #fff000; ");
                sedy3.setScaleZ(69);
            } else if (sedy2.getScaleZ() != 69) {
                sedy2.setStyle("-fx-background-color: #fff000; ");
                sedy2.setScaleZ(69);
            } else {
                sedy1.setStyle("-fx-background-color: #fff000; ");
            }
        }


        if (barva3 == button3) {
            if (sedy4.getScaleZ() != 69) {
                sedy4.setStyle("-fx-background-color: #ff0000; ");
                sedy4.setScaleZ(69);
            } else if (sedy3.getScaleZ() != 69) {
                sedy3.setStyle("-fx-background-color: #ff0000; ");
                sedy3.setScaleZ(69);
            } else if (sedy2.getScaleZ() != 69) {
                sedy2.setStyle("-fx-background-color: #ff0000; ");
                sedy2.setScaleZ(69);
            } else {
                sedy1.setStyle("-fx-background-color: #ff0000; ");
            }

        } else if (barva3 == button1 || barva3 == button2 || barva3 == button4) {
            if (sedy4.getScaleZ() != 69) {
                sedy4.setStyle("-fx-background-color: #fff000; ");
                sedy4.setScaleZ(69);
            } else if (sedy3.getScaleZ() != 69) {
                sedy3.setStyle("-fx-background-color: #fff000; ");
                sedy3.setScaleZ(69);
            } else if (sedy2.getScaleZ() != 69) {
                sedy2.setStyle("-fx-background-color: #fff000; ");
                sedy2.setScaleZ(69);
            } else {
                sedy1.setStyle("-fx-background-color: #fff000; ");
            }
        }

        if (barva4 == button4) {
            if (sedy4.getScaleZ() != 69) {
                sedy4.setStyle("-fx-background-color: #ff0000; ");
                sedy4.setScaleZ(69);
            } else if (sedy3.getScaleZ() != 69) {
                sedy3.setStyle("-fx-background-color: #ff0000; ");
                sedy3.setScaleZ(69);
            } else if (sedy2.getScaleZ() != 69) {
                sedy2.setStyle("-fx-background-color: #ff0000; ");
                sedy2.setScaleZ(69);
            } else {
                sedy1.setStyle("-fx-background-color: #ff0000; ");
            }

        } else if (barva4 == button1 || barva4 == button2 || barva4 == button3) {
            if (sedy4.getScaleZ() != 69) {
                sedy4.setStyle("-fx-background-color: #fff000; ");
                sedy4.setScaleZ(69);
            } else if (sedy3.getScaleZ() != 69) {
                sedy3.setStyle("-fx-background-color: #fff000; ");
                sedy3.setScaleZ(69);
            } else if (sedy2.getScaleZ() != 69) {
                sedy2.setStyle("-fx-background-color: #fff000; ");
                sedy2.setScaleZ(69);
            } else {
                sedy1.setStyle("-fx-background-color: #fff000; ");
            }
        }

    }

    public void lastAnswer(int barva1, int barva2, int barva3, int barva4, Button button1a, Button button2a, Button button3a, Button button4a, Button sedy1, Button sedy2, Button sedy3, Button sedy4, Label label1, Button check, Button restart, Label vysledky) {

        double button1 = button1a.getScaleZ();
        double button2 = button2a.getScaleZ();
        double button3 = button3a.getScaleZ();
        double button4 = button4a.getScaleZ();


        if (barva1 == button1 && barva2 == button2 && barva3 == button3 && barva4 == button4) {
            sedy1.setStyle("-fx-background-color: #ff0000; ");
            sedy2.setStyle("-fx-background-color: #ff0000; ");
            sedy3.setStyle("-fx-background-color: #ff0000; ");
            sedy4.setStyle("-fx-background-color: #ff0000; ");

            label1.setText("yoo Vyhráli jste");
            check.setStyle("-fx-background-color: #ffffff; ");
            check.setDisable(true);
            restart.setStyle("-fx-background-color: #00ff29; ");
        } else {


            if (barva1 == button1) {
                sedy4.setStyle("-fx-background-color: #ff0000; ");
                sedy4.setScaleZ(69);
            } else if (barva1 == button2 || barva1 == button3 || barva1 == button4) {
                sedy4.setStyle("-fx-background-color: #fff000; ");
                sedy4.setScaleZ(69);
            }


            if (barva2 == button2) {
                if (sedy4.getScaleZ() != 69) {
                    sedy4.setStyle("-fx-background-color: #ff0000; ");
                    sedy4.setScaleZ(69);
                } else if (sedy3.getScaleZ() != 69) {
                    sedy3.setStyle("-fx-background-color: #ff0000; ");
                    sedy3.setScaleZ(69);
                } else if (sedy2.getScaleZ() != 69) {
                    sedy2.setStyle("-fx-background-color: #ff0000; ");
                    sedy2.setScaleZ(69);
                } else {
                    sedy1.setStyle("-fx-background-color: #ff0000; ");
                }

            } else if (barva2 == button1 || barva2 == button3 || barva2 == button4) {
                if (sedy4.getScaleZ() != 69) {
                    sedy4.setStyle("-fx-background-color: #fff000; ");
                    sedy4.setScaleZ(69);
                } else if (sedy3.getScaleZ() != 69) {
                    sedy3.setStyle("-fx-background-color: #fff000; ");
                    sedy3.setScaleZ(69);
                } else if (sedy2.getScaleZ() != 69) {
                    sedy2.setStyle("-fx-background-color: #fff000; ");
                    sedy2.setScaleZ(69);
                } else {
                    sedy1.setStyle("-fx-background-color: #fff000; ");
                }
            }


            if (barva3 == button3) {
                if (sedy4.getScaleZ() != 69) {
                    sedy4.setStyle("-fx-background-color: #ff0000; ");
                    sedy4.setScaleZ(69);
                } else if (sedy3.getScaleZ() != 69) {
                    sedy3.setStyle("-fx-background-color: #ff0000; ");
                    sedy3.setScaleZ(69);
                } else if (sedy2.getScaleZ() != 69) {
                    sedy2.setStyle("-fx-background-color: #ff0000; ");
                    sedy2.setScaleZ(69);
                } else {
                    sedy1.setStyle("-fx-background-color: #ff0000; ");
                }

            } else if (barva3 == button1 || barva3 == button2 || barva3 == button4) {
                if (sedy4.getScaleZ() != 69) {
                    sedy4.setStyle("-fx-background-color: #fff000; ");
                    sedy4.setScaleZ(69);
                } else if (sedy3.getScaleZ() != 69) {
                    sedy3.setStyle("-fx-background-color: #fff000; ");
                    sedy3.setScaleZ(69);
                } else if (sedy2.getScaleZ() != 69) {
                    sedy2.setStyle("-fx-background-color: #fff000; ");
                    sedy2.setScaleZ(69);
                } else {
                    sedy1.setStyle("-fx-background-color: #fff000; ");
                }


            }
            if (barva4 == button4) {
                if (sedy4.getScaleZ() != 69) {
                    sedy4.setStyle("-fx-background-color: #ff0000; ");
                    sedy4.setScaleZ(69);
                } else if (sedy3.getScaleZ() != 69) {
                    sedy3.setStyle("-fx-background-color: #ff0000; ");
                    sedy3.setScaleZ(69);
                } else if (sedy2.getScaleZ() != 69) {
                    sedy2.setStyle("-fx-background-color: #ff0000; ");
                    sedy2.setScaleZ(69);
                } else {
                    sedy1.setStyle("-fx-background-color: #ff0000; ");
                }

            } else if (barva4 == button1 || barva4 == button2 || barva4 == button3) {
                if (sedy4.getScaleZ() != 69) {
                    sedy4.setStyle("-fx-background-color: #fff000; ");
                    sedy4.setScaleZ(69);
                } else if (sedy3.getScaleZ() != 69) {
                    sedy3.setStyle("-fx-background-color: #fff000; ");
                    sedy3.setScaleZ(69);
                } else if (sedy2.getScaleZ() != 69) {
                    sedy2.setStyle("-fx-background-color: #fff000; ");
                    sedy2.setScaleZ(69);
                } else {
                    sedy1.setStyle("-fx-background-color: #fff000; ");
                }
            }

            label1.setText("Prohráli jste :(");
            restart.setStyle("-fx-background-color: #00ff29; ");
            check.setStyle("-fx-background-color: #ffffff; ");
            check.setDisable(true);
            vysledky.setText("Správné barvy: " + barva1 + "" + barva2 + "" + barva3 + "" + barva4);
            
        }
    }

    public void scaleZ0(Button button){
        button.setScaleZ(0.1);

    }

}