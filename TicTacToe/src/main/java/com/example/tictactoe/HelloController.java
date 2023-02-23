package com.example.tictactoe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloController {
    @FXML
    private ImageView seminole;
    @FXML
    private ImageView gator;
    @FXML
    private GridPane gameGrid;
    private ImageView temp1 = new ImageView();
    private ImageView temp2 = new ImageView();
    @FXML
    private GridPane gridPanel;

    @FXML
    private ImageView oIcon;

    @FXML
    private Button resetButton;
    @FXML
    private Button changeIconsButton;
    @FXML
    private Button square1 = new Button();

    @FXML
    private Button square2= new Button();

    @FXML
    private Button square3= new Button();

    @FXML
    private Button square4= new Button();

    @FXML
    private Button square5= new Button();

    @FXML
    private Button square6= new Button();

    @FXML
    private Button square7= new Button();

    @FXML
    private Button square8= new Button();

    @FXML
    private Button square9= new Button();

    @FXML
    private Label titleLabel;

    @FXML
    private VBox window;

    @FXML
    private ImageView xIcon;
    @FXML
    private List<ImageView> images = new ArrayList<>();
    private int[] oCountColumn = new int[3];
    private int[] oCountRow = new int[3];
    private int[] oCountDiagonal = new int[2];
    @FXML
    void switchToImage(ActionEvent event) {
        if (event.getSource() == square1) {
            System.out.println("source");
            square1.setDisable(true);
            square1.setVisible(false);
            square1.setOpacity(.99);
            ImageView image = new ImageView(oIcon.getImage());
            image.setOpacity(1);
            gameGrid.add(image, 0, 0);
            images.add(image);
            checkColumnWin(0);
            checkRowWin(0);
            checkDiagonalWin(0);
            checkTie();
            oCountColumn[0]++;
            oCountRow[0]++;
            oCountDiagonal[0]++;
            aiTurn(0, 0,0);
        } else if (event.getSource() == square2) {
            System.out.println("source");
            square2.setDisable(true);
            square2.setVisible(false);
            square2.setOpacity(.99);
            ImageView image = new ImageView(oIcon.getImage());
            image.setOpacity(1);
            gameGrid.add(image, 1, 0);
            images.add(image);
            checkColumnWin(1);
            checkRowWin(0);
            checkTie();
            oCountColumn[1]++;
            oCountRow[0]++;
            aiTurn(1,0,-1);
        } else if (event.getSource() == square3) {
            System.out.println("source");
            square3.setDisable(true);
            square3.setVisible(false);
            square3.setOpacity(.99);
            ImageView image = new ImageView(oIcon.getImage());
            image.setOpacity(1);
            gameGrid.add(image, 2, 0);
            images.add(image);
            checkColumnWin(2);
            checkRowWin(0);
            checkDiagonalWin(1);
            checkTie();
            oCountColumn[2]++;
            oCountRow[0]++;
            oCountDiagonal[1]++;
            aiTurn(2,0,1);
        } else if (event.getSource() == square4) {
            System.out.println("source");
            square4.setDisable(true);
            square4.setVisible(false);
            square4.setOpacity(.99);
            ImageView image = new ImageView(oIcon.getImage());
            image.setOpacity(1);
            gameGrid.add(image, 0, 1);
            images.add(image);
            checkColumnWin(0);
            checkRowWin(1);
            checkTie();
            oCountColumn[0]++;
            oCountRow[1]++;
            aiTurn(0,1,-1);
        } else if (event.getSource() == square5) {
            System.out.println("source");
            square5.setDisable(true);
            square5.setVisible(false);
            square5.setOpacity(.99);
            ImageView image = new ImageView(oIcon.getImage());
            image.setOpacity(1);
            gameGrid.add(image, 1, 1);
            images.add(image);
            checkColumnWin(1);
            checkRowWin(1);
            checkDiagonalWin(0);
            checkDiagonalWin(1);
            checkTie();
            oCountColumn[1]++;
            oCountRow[1]++;
            oCountDiagonal[0]++;
            oCountDiagonal[1]++;
            aiTurn(1,1,0);
        } else if (event.getSource() == square6) {
            System.out.println("source");
            square6.setDisable(true);
            square6.setVisible(false);
            square6.setOpacity(.99);
            ImageView image = new ImageView(oIcon.getImage());
            image.setOpacity(1);
            gameGrid.add(image, 2, 1);
            images.add(image);
            checkColumnWin(2);
            checkRowWin(1);
            checkTie();
            oCountColumn[2]++;
            oCountRow[1]++;
            aiTurn(2,1,-1);
        } else if (event.getSource() == square7) {
            System.out.println("source");
            square7.setDisable(true);
            square7.setVisible(false);
            square7.setOpacity(.99);
            ImageView image = new ImageView(oIcon.getImage());
            image.setOpacity(1);
            gameGrid.add(image, 0, 2);
            images.add(image);
            checkColumnWin(0);
            checkRowWin(2);
            checkDiagonalWin(1);
            checkTie();
            oCountColumn[0]++;
            oCountRow[2]++;
            oCountDiagonal[1]++;
            aiTurn(0,2,1);
        } else if (event.getSource() == square8) {
            System.out.println("source");
            square8.setDisable(true);
            square8.setVisible(false);
            square8.setOpacity(.99);
            ImageView image = new ImageView(oIcon.getImage());
            image.setOpacity(1);
            gameGrid.add(image, 1, 2);
            images.add(image);
            checkColumnWin(1);
            checkRowWin(2);
            checkTie();
            oCountColumn[1]++;
            oCountRow[2]++;
            aiTurn(1,2,-1);
        } else{
            System.out.println("source");
            square9.setDisable(true);
            square9.setVisible(false);
            square9.setOpacity(.99);
            ImageView image = new ImageView(oIcon.getImage());
            image.setOpacity(1);
            gameGrid.add(image, 2, 2);
            images.add(image);
            checkColumnWin(2);
            checkRowWin(2);
            checkDiagonalWin(0);
            checkTie();
            oCountColumn[2]++;
            oCountRow[2]++;
            oCountDiagonal[0]++;
            aiTurn(2,2,0);
        }
    }
    @FXML
    void changeIcons(){
        temp1.setImage(xIcon.getImage());
        temp2.setImage(oIcon.getImage());
        xIcon.setImage(gator.getImage());
        oIcon.setImage(seminole.getImage());
        gator.setImage(temp1.getImage());
        seminole.setImage(temp2.getImage());
        changeIconsButton.setVisible(false);
        changeIconsButton.setDisable(true);
        resetGame();
    }
    @FXML
    void checkTie(){
        if ((square1.isDisable())&&(square2.isDisable())&&(square3.isDisable())&&(square4.isDisable())&&
                (square5.isDisable()) && (square6.isDisable()) && (square7.isDisable()) && (square8.isDisable()) &&
                (square9.isDisable())){
            square4.setVisible(false);
            square4.setDisable(true);
            square5.setVisible(false);
            square5.setDisable(true);
            square6.setVisible(false);
            square6.setDisable(true);
            square7.setVisible(false);
            square7.setDisable(true);
            square8.setVisible(false);
            square8.setDisable(true);
            square9.setVisible(false);
            square9.setDisable(true);
            resetButton.setVisible(true);
            resetButton.setDisable(false);
            changeIconsButton.setVisible(true);
            changeIconsButton.setDisable(false);
        }
    }
    @FXML
    void resetGame(){
        square1.setDisable(false);
        square1.setVisible(true);
        square1.setOpacity(1);
        square2.setDisable(false);
        square2.setVisible(true);
        square2.setOpacity(1);
        square3.setDisable(false);
        square3.setVisible(true);
        square3.setOpacity(1);
        square4.setDisable(false);
        square4.setVisible(true);
        square4.setOpacity(1);
        square5.setDisable(false);
        square5.setVisible(true);
        square5.setOpacity(1);
        square6.setDisable(false);
        square6.setVisible(true);
        square6.setOpacity(1);
        square7.setDisable(false);
        square7.setVisible(true);
        square7.setOpacity(1);
        square8.setDisable(false);
        square8.setVisible(true);
        square8.setOpacity(1);
        square9.setDisable(false);
        square9.setVisible(true);
        square9.setOpacity(1);
        resetButton.setVisible(false);
        resetButton.setDisable(true);
        changeIconsButton.setVisible(false);
        changeIconsButton.setDisable(true);
        for (int i = 0; i < images.size(); i++) {
            gameGrid.getChildren().remove(images.get(i));
        }
        for (int i = 0; i < oCountColumn.length; i++) {
            oCountColumn[i] = 0;
            oCountRow[i] = 0;
        }
        oCountDiagonal[0] = 0;
        oCountDiagonal[1] = 0;
    }
    void aiTurn(int column, int row, int diagonal){
        ImageView imageView = new ImageView(xIcon.getImage());
        imageView.setOpacity(1);

        String willWin ="none";
        System.out.println(oCountRow[2]);
        if (oCountRow[row] == 2){
            willWin = "row";
            System.out.println("row " + row + "has 2");
        } else if (oCountColumn[column] == 2) {
            willWin = "column";
            System.out.println("column " + column + "has 2");
        } else if ((diagonal != -1) && (oCountDiagonal[diagonal] == 2)){
            willWin = "diagonal";
            System.out.println("diagonal " + diagonal + "has 2");
        }
        if (willWin == "none"){
            System.out.println("no 2's");
        }
        if (willWin.equals("row")){
            /*square9.setDisable(true);
            square9.setVisible(false);
            square9.setOpacity(.99);
            ImageView image = new ImageView(oIcon.getImage());
            image.setOpacity(1);
            gameGrid.add(image, 2, 2);
            images.add(image);
            checkColumnWin(2);
            checkRowWin(2);
            checkDiagonalWin(0);
            checkTie();
         */
            switch (row){
                case 0:
                    if (!square1.isDisable()){
                        square1.setVisible(false);
                        square1.setDisable(true);
                        square1.setOpacity(.98);
                        gameGrid.add(imageView, 0, 0);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountRow[0] = 3;
                    } else if (!square2.isDisable()) {
                        square2.setVisible(false);
                        square2.setDisable(true);
                        square2.setOpacity(.98);
                        gameGrid.add(imageView, 1, 0);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountRow[0] = 3;
                    }else if(!square3.isDisable()){
                        //square3
                        square3.setVisible(false);
                        square3.setDisable(true);
                        square3.setOpacity(.98);
                        gameGrid.add(imageView, 1, 1);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountRow[0] = 3;
                    }
                    break;
                case 1:
                    if (!square4.isDisable()){
                        square4.setVisible(false);
                        square4.setDisable(true);
                        square4.setOpacity(.98);
                        gameGrid.add(imageView, 0, 1);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountRow[1] = 3;
                    } else if (!square5.isDisable()) {
                        square5.setVisible(false);
                        square5.setDisable(true);
                        square5.setOpacity(.98);
                        gameGrid.add(imageView, 1,1);
                        images.add(imageView);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountRow[1] = 3;
                    }else if(!square6.isDisable()){
                        //square6
                        square6.setVisible(false);
                        square6.setDisable(true);
                        square6.setOpacity(.98);
                        gameGrid.add(imageView, 2, 1);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountRow[1] = 3;
                    }
                    break;
                case 2:
                    if (!square7.isDisable()){
                        square7.setVisible(false);
                        square7.setDisable(true);
                        square7.setOpacity(.98);
                        gameGrid.add(imageView, 0, 2);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountRow[2] = 3;
                    } else if (!square8.isDisable()) {
                        square8.setVisible(false);
                        square8.setDisable(true);
                        square8.setOpacity(.98);
                        gameGrid.add(imageView, 1, 2);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountRow[2] = 3;
                    }else if(!square9.isDisable()){
                        //square9
                        square9.setVisible(false);
                        square9.setDisable(true);
                        square9.setOpacity(.98);
                        gameGrid.add(imageView, 2, 2);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountRow[2] = 3;
                    }
                    break;
            }
        }
        if (willWin.equals("column")){
            switch (column){
                case 0:
                    if (!square1.isDisable()){
                        square1.setVisible(false);
                        square1.setDisable(true);
                        square1.setOpacity(.98);
                        gameGrid.add(imageView, 0, 0);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountColumn[0] = 3;
                    } else if (!square4.isDisable()) {
                        square4.setVisible(false);
                        square4.setDisable(true);
                        square4.setOpacity(.98);
                        gameGrid.add(imageView, 0, 1);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountColumn[0] = 3;
                    }else if(!square7.isDisable()) {
                        //square7
                        square7.setVisible(false);
                        square7.setDisable(true);
                        square7.setOpacity(.98);
                        gameGrid.add(imageView, 0, 2);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountColumn[0] = 3;
                    }
                    break;
                case 1:
                    if (!square2.isDisable()){
                        square2.setVisible(false);
                        square2.setDisable(true);
                        square2.setOpacity(.98);
                        gameGrid.add(imageView, 1, 0);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountColumn[1] = 3;
                    } else if (!square5.isDisable()) {
                        square5.setVisible(false);
                        square5.setDisable(true);
                        square5.setOpacity(.98);
                        gameGrid.add(imageView, 1, 1);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountColumn[1] = 3;
                    }else if(!square8.isDisable()){
                        //square8
                        square8.setVisible(false);
                        square8.setDisable(true);
                        square8.setOpacity(.98);
                        gameGrid.add(imageView, 1, 2);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountColumn[1] = 3;
                    }
                    break;
                case 2:
                    if (!square3.isDisable()){
                        square3.setVisible(false);
                        square3.setDisable(true);
                        square3.setOpacity(.98);
                        gameGrid.add(imageView, 2, 0);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountColumn[2] = 3;
                    } else if (!square6.isDisable()) {
                        square6.setVisible(false);
                        square6.setDisable(true);
                        square6.setOpacity(.98);
                        gameGrid.add(imageView, 2, 1);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountColumn[2] = 3;
                    }else if(!square9.isDisable()){
                        //square9
                        square9.setVisible(false);
                        square9.setDisable(true);
                        square9.setOpacity(.98);
                        gameGrid.add(imageView, 2, 2);
                        images.add(imageView);
                        checkColumnWin(column);
                        checkRowWin(row);
                        checkDiagonalWin(diagonal);
                        oCountColumn[2] = 3;
                    }
                    break;
            }
        }
        if (willWin.equals("diagonal")){
            if (diagonal == 0){
                if (!square1.isDisable()){
                    square1.setVisible(false);
                    square1.setDisable(true);
                    square1.setOpacity(.98);
                    gameGrid.add(imageView, 0, 0);
                    images.add(imageView);
                    checkColumnWin(column);
                    checkRowWin(row);
                    checkDiagonalWin(diagonal);
                    oCountDiagonal[0] = 3;
                } else if (!square5.isDisable()) {
                    square5.setVisible(false);
                    square5.setDisable(true);
                    square5.setOpacity(.98);
                    gameGrid.add(imageView, 1, 1);
                    images.add(imageView);
                    checkColumnWin(column);
                    checkRowWin(row);
                    checkDiagonalWin(diagonal);
                    oCountDiagonal[0] = 3;
                }else if(!square9.isDisable()){
                    //square9
                    square9.setVisible(false);
                    square9.setDisable(true);
                    square9.setOpacity(.98);
                    gameGrid.add(imageView, 2, 2);
                    images.add(imageView);
                    checkColumnWin(column);
                    checkRowWin(row);
                    checkDiagonalWin(diagonal);
                    oCountDiagonal[0] = 3;
                }
            }else {
                if (!square3.isDisable()){
                    square3.setVisible(false);
                    square3.setDisable(true);
                    square3.setOpacity(.98);
                    gameGrid.add(imageView, 2, 0);
                    images.add(imageView);
                    checkColumnWin(column);
                    checkRowWin(row);
                    checkDiagonalWin(diagonal);
                    oCountDiagonal[1] = 3;
                } else if (!square5.isDisable()) {
                    square5.setVisible(false);
                    square5.setDisable(true);
                    square5.setOpacity(.98);
                    gameGrid.add(imageView, 1, 1);
                    images.add(imageView);
                    checkColumnWin(column);
                    checkRowWin(row);
                    checkDiagonalWin(diagonal);
                    oCountDiagonal[1] = 3;
                }else if(!square7.isDisable()){
                    //square7
                    square7.setVisible(false);
                    square7.setDisable(true);
                    square7.setOpacity(.98);
                    gameGrid.add(imageView, 0, 2);
                    images.add(imageView);
                    checkColumnWin(column);
                    checkRowWin(row);
                    checkDiagonalWin(diagonal);
                    oCountDiagonal[1] = 3;
                }
            }
        }
        if (willWin.equals("none")){
            if (!square5.isDisable()){
                square5.setVisible(false);
                square5.setDisable(true);
                square5.setOpacity(.98);
                gameGrid.add(imageView, 1, 1);
                images.add(imageView);
                checkColumnWin(column);
                checkRowWin(row);
                checkDiagonalWin(diagonal);
                oCountDiagonal[0] = 3;
                oCountDiagonal[1] = 3;
                oCountRow[1] = 3;
                oCountColumn[1] = 3;
                //square5
            }else if (!square1.isDisable()){
                square1.setVisible(false);
                square1.setDisable(true);
                square1.setOpacity(.98);
                gameGrid.add(imageView, 0, 0);
                images.add(imageView);
                checkColumnWin(column);
                checkRowWin(row);
                checkDiagonalWin(diagonal);
                oCountDiagonal[0] = 3;
                oCountRow[0]=3;
                oCountColumn[0]=3;
                //square 1
            }else if (!square3.isDisable()){
                square3.setVisible(false);
                square3.setDisable(true);
                square3.setOpacity(.98);
                gameGrid.add(imageView, 2, 0);
                images.add(imageView);
                checkColumnWin(column);
                checkRowWin(row);
                checkDiagonalWin(diagonal);
                oCountDiagonal[1] = 3;
                oCountRow[0]=3;
                oCountColumn[2]=3;
                //square 3
            }else if (!square7.isDisable()){
                square7.setVisible(false);
                square7.setDisable(true);
                square7.setOpacity(.98);
                gameGrid.add(imageView, 0, 2);
                images.add(imageView);
                checkColumnWin(column);
                checkRowWin(row);
                checkDiagonalWin(diagonal);
                oCountDiagonal[1] = 3;
                oCountRow[2]=3;
                oCountColumn[0]=3;
                //square 7
            }else if (!square9.isDisable()){
                square9.setVisible(false);
                square9.setDisable(true);
                square9.setOpacity(.98);
                gameGrid.add(imageView, 2, 2);
                images.add(imageView);
                checkColumnWin(column);
                checkRowWin(row);
                checkDiagonalWin(diagonal);
                oCountDiagonal[0] = 3;
                oCountRow[2]=3;
                oCountColumn[2]=3;
                //square 9
            }else if (!square2.isDisable()){
                square2.setVisible(false);
                square2.setDisable(true);
                square2.setOpacity(.98);
                gameGrid.add(imageView, 1, 0);
                images.add(imageView);
                checkColumnWin(column);
                checkRowWin(row);
                checkDiagonalWin(diagonal);
                oCountRow[0]=3;
                oCountColumn[1]=3;
                //square 2
            }else if (!square4.isDisable()){
                square4.setVisible(false);
                square4.setDisable(true);
                square4.setOpacity(.98);
                gameGrid.add(imageView, 0, 1);
                images.add(imageView);
                checkColumnWin(column);
                checkRowWin(row);
                checkDiagonalWin(diagonal);
                oCountRow[1]=3;
                oCountColumn[0]=3;
                //square 4
            }else if (!square6.isDisable()){
                square6.setVisible(false);
                square6.setDisable(true);
                square6.setOpacity(.98);
                gameGrid.add(imageView, 2, 1);
                images.add(imageView);
                checkColumnWin(column);
                checkRowWin(row);
                checkDiagonalWin(diagonal);
                oCountRow[1]=3;
                oCountColumn[2]=3;
                //square 6
            }else if (!square8.isDisable()){
                square8.setVisible(false);
                square8.setDisable(true);
                square8.setOpacity(.98);
                gameGrid.add(imageView, 1, 2);
                images.add(imageView);
                checkColumnWin(column);
                checkRowWin(row);
                checkDiagonalWin(diagonal);
                oCountRow[2]=3;
                oCountColumn[1]=3;
                //square 8
            }
        }
    }
    void checkRowWin(int row){
        if (row==0){
            if ((square1.getOpacity() == .99)&&(square2.getOpacity() == .99)&&(square3.getOpacity() == .99)){
                square4.setVisible(false);
                square4.setDisable(true);
                square5.setVisible(false);
                square5.setDisable(true);
                square6.setVisible(false);
                square6.setDisable(true);
                square7.setVisible(false);
                square7.setDisable(true);
                square8.setVisible(false);
                square8.setDisable(true);
                square9.setVisible(false);
                square9.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        else if (row==1){
            if ((square4.getOpacity() == .99)&&(square5.getOpacity() == .99)&&(square6.getOpacity() == .99)){
                square1.setVisible(false);
                square1.setDisable(true);
                square2.setVisible(false);
                square2.setDisable(true);
                square3.setVisible(false);
                square3.setDisable(true);
                square7.setVisible(false);
                square7.setDisable(true);
                square8.setVisible(false);
                square8.setDisable(true);
                square9.setVisible(false);
                square9.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        else{
            if ((square7.getOpacity() == .99)&&(square8.getOpacity() == .99)&&(square9.getOpacity() == .99)){
                square1.setVisible(false);
                square1.setDisable(true);
                square2.setVisible(false);
                square2.setDisable(true);
                square3.setVisible(false);
                square3.setDisable(true);
                square4.setVisible(false);
                square4.setDisable(true);
                square5.setVisible(false);
                square5.setDisable(true);
                square6.setVisible(false);
                square6.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        if (row==0){
            if ((square1.getOpacity() == .98)&&(square2.getOpacity() == .98)&&(square3.getOpacity() == .98)){
                square4.setVisible(false);
                square4.setDisable(true);
                square5.setVisible(false);
                square5.setDisable(true);
                square6.setVisible(false);
                square6.setDisable(true);
                square7.setVisible(false);
                square7.setDisable(true);
                square8.setVisible(false);
                square8.setDisable(true);
                square9.setVisible(false);
                square9.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        else if (row==1){
            if ((square4.getOpacity() == .98)&&(square5.getOpacity() == .98)&&(square6.getOpacity() == .98)){
                square1.setVisible(false);
                square1.setDisable(true);
                square2.setVisible(false);
                square2.setDisable(true);
                square3.setVisible(false);
                square3.setDisable(true);
                square7.setVisible(false);
                square7.setDisable(true);
                square8.setVisible(false);
                square8.setDisable(true);
                square9.setVisible(false);
                square9.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        else{
            if ((square7.getOpacity() == .98)&&(square8.getOpacity() == .98)&&(square9.getOpacity() == .98)){
                square1.setVisible(false);
                square1.setDisable(true);
                square2.setVisible(false);
                square2.setDisable(true);
                square3.setVisible(false);
                square3.setDisable(true);
                square4.setVisible(false);
                square4.setDisable(true);
                square5.setVisible(false);
                square5.setDisable(true);
                square6.setVisible(false);
                square6.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
    }
    void checkColumnWin(int column){
        if (column == 0){
            if ((square1.getOpacity() == .99) &&(square4.getOpacity() == .99) &&(square7.getOpacity() == .99)){
                square2.setVisible(false);
                square2.setDisable(true);
                square3.setVisible(false);
                square3.setDisable(true);
                square5.setVisible(false);
                square5.setDisable(true);
                square6.setVisible(false);
                square6.setDisable(true);
                square8.setVisible(false);
                square8.setDisable(true);
                square9.setVisible(false);
                square9.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        else if(column==1){
            if ((square2.getOpacity() == .99) &&(square5.getOpacity() == .99) &&(square8.getOpacity() == .99)){
                square1.setVisible(false);
                square1.setDisable(true);
                square3.setVisible(false);
                square3.setDisable(true);
                square4.setVisible(false);
                square4.setDisable(true);
                square6.setVisible(false);
                square6.setDisable(true);
                square7.setVisible(false);
                square7.setDisable(true);
                square9.setVisible(false);
                square9.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        else {
            if ((square3.getOpacity() == .99) &&(square6.getOpacity() == .99) &&(square9.getOpacity() == .99)){
                square1.setVisible(false);
                square1.setDisable(true);
                square2.setVisible(false);
                square2.setDisable(true);
                square4.setVisible(false);
                square4.setDisable(true);
                square5.setVisible(false);
                square5.setDisable(true);
                square7.setVisible(false);
                square7.setDisable(true);
                square8.setVisible(false);
                square8.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        if (column == 0){
            if ((square1.getOpacity() == .98) &&(square4.getOpacity() == .98) &&(square7.getOpacity() == .98)){
                square2.setVisible(false);
                square2.setDisable(true);
                square3.setVisible(false);
                square3.setDisable(true);
                square5.setVisible(false);
                square5.setDisable(true);
                square6.setVisible(false);
                square6.setDisable(true);
                square8.setVisible(false);
                square8.setDisable(true);
                square9.setVisible(false);
                square9.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        else if(column==1){
            if ((square2.getOpacity() == .98) &&(square5.getOpacity() == .98) &&(square8.getOpacity() == .98)){
                square1.setVisible(false);
                square1.setDisable(true);
                square3.setVisible(false);
                square3.setDisable(true);
                square4.setVisible(false);
                square4.setDisable(true);
                square6.setVisible(false);
                square6.setDisable(true);
                square7.setVisible(false);
                square7.setDisable(true);
                square9.setVisible(false);
                square9.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        else {
            if ((square3.getOpacity() == .98) &&(square6.getOpacity() == .98) &&(square9.getOpacity() == .98)){
                square1.setVisible(false);
                square1.setDisable(true);
                square2.setVisible(false);
                square2.setDisable(true);
                square4.setVisible(false);
                square4.setDisable(true);
                square5.setVisible(false);
                square5.setDisable(true);
                square7.setVisible(false);
                square7.setDisable(true);
                square8.setVisible(false);
                square8.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
    }
    void checkDiagonalWin(int left){
        if (left == 0){
            if ((square1.getOpacity() == .99)&&(square5.getOpacity() == .99)&&(square9.getOpacity() == .99)){
                square2.setVisible(false);
                square2.setDisable(true);
                square3.setVisible(false);
                square3.setDisable(true);
                square4.setVisible(false);
                square4.setDisable(true);
                square6.setVisible(false);
                square6.setDisable(true);
                square7.setVisible(false);
                square7.setDisable(true);
                square8.setVisible(false);
                square8.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        else {
            if ((square3.getOpacity() == .99)&&(square5.getOpacity() == .99)&&(square7.getOpacity() == .99)){
                square1.setVisible(false);
                square1.setDisable(true);
                square2.setVisible(false);
                square2.setDisable(true);
                square4.setVisible(false);
                square4.setDisable(true);
                square6.setVisible(false);
                square6.setDisable(true);
                square8.setVisible(false);
                square8.setDisable(true);
                square9.setVisible(false);
                square9.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        if (left == 0){
            if ((square1.getOpacity() == .98)&&(square5.getOpacity() == .98)&&(square9.getOpacity() == .98)){
                square2.setVisible(false);
                square2.setDisable(true);
                square3.setVisible(false);
                square3.setDisable(true);
                square4.setVisible(false);
                square4.setDisable(true);
                square6.setVisible(false);
                square6.setDisable(true);
                square7.setVisible(false);
                square7.setDisable(true);
                square8.setVisible(false);
                square8.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
        else {
            if ((square3.getOpacity() == .98)&&(square5.getOpacity() == .98)&&(square7.getOpacity() == .98)){
                square1.setVisible(false);
                square1.setDisable(true);
                square2.setVisible(false);
                square2.setDisable(true);
                square4.setVisible(false);
                square4.setDisable(true);
                square6.setVisible(false);
                square6.setDisable(true);
                square8.setVisible(false);
                square8.setDisable(true);
                square9.setVisible(false);
                square9.setDisable(true);
                resetButton.setVisible(true);
                resetButton.setDisable(false);
                changeIconsButton.setVisible(true);
                changeIconsButton.setDisable(false);
            }
        }
    }
}
