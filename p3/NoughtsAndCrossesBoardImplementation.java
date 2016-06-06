/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

/**
 *
 * @author Vero
 */
public class NoughtsAndCrossesBoardImplementation implements NoughtsAndCrossesBoard {

    Color [][] tablero= {{Color.RED,Color.VOID,Color.WHITE},{Color.WHITE,Color.RED,Color.VOID}, {Color.RED,Color.VOID,Color.WHITE}};
    Color currentColor;
    int countRed=0, countWhite=0; 
    boolean gameexit;
    
    @Override
    public boolean isGameOver() {
        gameexit =comprobar (countRed, countWhite);
        if (gameexit==true){
            return true;
        }
        else {
            return false;
        } 
    }

    @Override
    public boolean movePiece(int fromX, int fromY, int toX, int toY) {
        if (canMovePieceAt (toX,toY)==true && tablero[toY][toX]== Color.VOID && tablero[fromY][fromX]==currentColor){
            tablero[toY][toX]=currentColor;
            tablero[fromY][fromX]=Color.VOID;
            return true;
        }
        else{
          return false;
        }  
    }
        

    @Override
    public Color getPieceAt(int x, int y) {
        if (canMovePieceAt(x,y)==false){
            return Color.VOID;
        }
        else{
            currentColor=tablero[y][x];
            return tablero[y][x];
        }
    }

    @Override
    public boolean canMovePieceAt(int x, int y) {
        if (x>=3 || y>=3 || x<0 || y<0){
            return false;
        }
        else{
            return true;
        }
    }


    public boolean comprobar (int countRed, int countWhite){
        int i, j=0;
        //Comprobar horizontales
        for (j=0; j<=2; j++){
            for (i=0; i<=2; i++){
                if (tablero[j][i]==Color.RED){
                    countRed=countRed+1;
                }
                if (tablero[j][i]==Color.WHITE){
                    countWhite=countWhite+1;
                }
            }
            if (countWhite==3 || countRed==3){
                return true;
            }
            else{
                countRed=0;
                countWhite=0;
            }
        }

        //Comprobar verticales
        for (j=0; j<=2; j++){
            for (i=0; i<=2; i++){
                if (tablero[i][j]==Color.RED){
                    countRed=countRed+1;
                }
                if (tablero[i][j]==Color.WHITE){
                    countWhite=countWhite+1;
                }
            }
            if (countWhite==3 || countRed==3){
                return true;
            }
            else{
                countRed=0;
                countWhite=0;
            }
        }
        //Comprobar diagonales
        Color central;
        if (tablero[1][1]!=Color.VOID){
            central=tablero[1][1];
            if (central==tablero[2][0] && central==tablero[0][2]){
                return true;
            }
            if (central==tablero[2][2] && central==tablero[0][0]){
                return true;
            }
        }
        return false;
    }
}