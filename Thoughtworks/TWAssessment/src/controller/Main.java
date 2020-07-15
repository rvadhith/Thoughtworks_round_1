package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import services.MiniFareEstimator;
import services.SUVFareEstimator;
import services.SedanFareEstimator;


public class Main {
	public static void main(String[] args) throws Exception {
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inp);
		System.out.println("Please enter the distance in kilometeres");
		int distance = Integer.parseInt(br.readLine());
		MiniFareEstimator mini = new MiniFareEstimator();
		SedanFareEstimator sedan = new SedanFareEstimator();
		SUVFareEstimator suv = new SUVFareEstimator();
		System.out.println("Kindly find the ride cost for " + distance + " kms in various vehicles");
		mini.fareEstimator(distance);
		sedan.fareEstimator(distance);
		suv.fareEstimator(distance);		
	}
}
