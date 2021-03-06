package com.company;

public class Main {

    //Width and Height of fractal image

    public static double WIDTH = 1920;
    public static double HEIGHT = 1080;

    /**
     *  When the program runs, this builds the fractal image itself and the window to display it
     */
    public static void main(String[] args) {

        new MainFrame();  //Using settings in MainFrame()

        int[][] iterationsArr = new int[(int)WIDTH][(int)HEIGHT];  //2-D array used for each pixel in the fractal's dimensions; stores amount of iterations per pixel

        Fractal fractal = new Fractal();

        //In reality didn't need to make a GenerateFractal method, could've just made everything a constant
        fractal.FractalSettings(fractal.RESTART, fractal.REEND, fractal.IMSTART, fractal.IMEND, WIDTH, HEIGHT, 0, 0, iterationsArr, Fractal.GENERATE_MANDELBROT, fractal.ITERATIONS);


        fractal.Fractal();


    }




}