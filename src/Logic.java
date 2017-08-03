/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tefa-PC
 */
public class Logic {
     private Object [][] matriz;//atributo tipo Object[][] matriz

    public Logic() {
    }

    /**
     * returna la matriz
     * @return (matriz)
     */
    public Object[][] getMatriz() {
        return matriz;
    }
    
    /**
     * elimina la matriz creada
     */
    public void deleteMatriz(){
        matriz = null;
    }
    
    /**
     * crea la matriz
     * @param rows(cantidad de líneas)
     * @param columns (cantidad de columnas)
     */
    public void createMatriz(int rows, int columns){
        matriz = new Object[rows][columns];
    }
    
    /**
     * recorre la matriz y limpia todos los campos
     */
    public void cleanMatriz(){
        for (int i = 0; i < matriz.length; i++) {//recorre filas
            for (int j = 0; j < matriz[i].length; j++) {//recorre columnas
                matriz[i][j] = null;//rellena con dato null
            }
        }
    }
    
    /**
     * llena una posición de la matriz
     * @param row (línea de la matriz)
     * @param column (columna de la matriz)
     * @param data (dato para rellenar)
     */
    public void addData(int row, int column, Object data){
        matriz[row][column] = data; //matriz[row][column] --> posición de la matriz
    }
}
    

