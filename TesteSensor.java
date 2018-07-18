package br.com.teste;
import lejos.nxt.*;
import lejos.util.Delay;
public class teste1 {

		public static void main(String[] args) {
			int[] v= new int[10];
			int i, d;
	        UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
	        System.out.println("Pressione para iniciar");
	        Button.waitForAnyPress();
	        
	        for (i=0;i<10;i++){
				d=sonar.getDistance();
				v[i]=d;
				System.out.println(v[i]);
				Delay.msDelay(500);
			}
			Button.waitForAnyPress();
		}
  //teste
 }