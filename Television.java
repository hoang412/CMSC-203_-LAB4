/**
 * The purpose of this class is to model a television
 * @author Hoang Nguyen 2/25/2020
 *
 */
import java.io.*;
import java.util.*;

public class Television {
	
		private String MANUFACTURER;
		private int SCREEN_SIZE;
		private boolean powerOn = false;
		private int channel = 2;
		private int volume = 20;

		public Television(String brand, int size) {
			MANUFACTURER = brand;
			SCREEN_SIZE = size;
		}

		public void setChannel(int station) {
			channel = station;
		}
		
		/**
		 * Switch the power On/Off
		 */
		public void power() {
			powerOn = !powerOn;
		}	
			
		public boolean getPower() {
			return this.powerOn;
		}
		
		/**
		 * Increase the volume by 1
		 */
		public void increaseVolume() {
			volume++;
		}
		
		/**
		 * decrease the volume by 1
		 */
		public void decreaseVolume() {
			volume--;
		}

		public int getVolume() {
			
			return volume;
		}

		public int getChannel() {
			
			return channel;
		}

		public String getManufacturer() {
			
			return MANUFACTURER;
		}

		public int getScreenSize() {
			
			return SCREEN_SIZE;
		}

	}


