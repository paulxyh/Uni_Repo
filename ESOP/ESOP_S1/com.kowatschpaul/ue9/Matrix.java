package com.kowatschpaul.ue9;

public class Matrix {
    protected int[][] matrix;

    public Matrix(int rows, int cols){
        matrix = new int[rows][cols];
    }
    public int getNumberOfColumns(){
        return this.matrix[0].length;
    }
    public int getNumberOfRows(){
        return this.matrix.length;
    }
    public int getElement(int row, int col){
        return this.matrix[row][col];
    }
    public void setElement(int row, int col, int value){
        this.matrix[row][col] = value;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < this.matrix.length; i++){
            for(int k = 0; k < this.matrix[i].length; k++){
                sb.append(this.matrix[i][k]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean isSquare(){
        if(this.matrix != null && this.matrix.length != 0 && this.matrix.length == this.matrix[0].length){
            for(int i = 1; i < this.matrix.length; i++){
                if(this.matrix.length != this.matrix[i].length)
                    return false;
            }
            return true;
        }
        else return false;
    }

    public Matrix multiply(Matrix factor){
        Matrix product = new Matrix(this.getNumberOfRows(), factor.getNumberOfColumns());
        for(int i = 0; i < product.getNumberOfRows(); i++){
            for(int k = 0; k < product.getNumberOfColumns(); k++){
                int temp = 0;
                for(int j = 0; j < this.getNumberOfColumns(); j++){
                    temp += this.getElement(i, j) * factor.getElement(j, k);
                }
                product.setElement(i, k, temp);
            }
        }
        return product;
    }
}
