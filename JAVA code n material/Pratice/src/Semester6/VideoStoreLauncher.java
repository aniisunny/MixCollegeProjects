package Semester6;

import java.util.Scanner;

class Video {
	String title;
	boolean flag;
	int rating;
	
	public Video() {
		title = "";
		flag = false;
		rating = 0;
	}
	
	public void isCheckedOut() {
		flag = true;
	}
	
	public void isCheckedIn() {
		flag = false;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
}

class VideoStore {
	Video video[];
	
	VideoStore(int n) {
		video = new Video[n];
	}
	
	public void addVideo(String title) {
		Video v = null;
		int i = 0;
		for(; i < video.length; i++) {
			v = video[i];
			if(v == null) 
				break;
			if(v.title.contains(title)) {
				System.out.println(title + " is already add in Videostore.");
				return;
			}
		}
		
		v= new Video();
		v.title = title;
		video[i] = v;
	
	}
	
	public void checkout(String title) {
		for(Video v : video) {
			if(v == null)
				break;
			if(v.title.contains(title))
				v.isCheckedOut();
		}
	}
	
	public void returnVideo(String title) {
		for(Video v : video) {
			if(v == null)
				break;
			if(v.title.contains(title))
				v.isCheckedIn();
		}
	}
	
	public void receiveRating(String title, int rating) {
		for(Video v : video) {
			if(v == null)
				break;
			if(v.title.contains(title))
				v.setRating(rating);
		}
	}
	
	public void listInventory() {
		for(Video v : video) {
			System.out.println(String.format("%-40s%-20s%-15s", "Title", "Rented Out", "Rating"));
			System.out.println(String.format("%-40s%-20s%-15s", v.title, v.flag, v.rating));
		}
	}
}

public class VideoStoreLauncher {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How much videos are added? ");
		int n =Integer.parseInt(sc.nextLine());
		
		VideoStore videoStore = new VideoStore(n);
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter a video title: ");
			String title = sc.nextLine();
			videoStore.addVideo(title);
			
			System.out.print("Enter a rating from 0 to 5: ");
			int rating = Integer.parseInt(sc.nextLine());
			videoStore.receiveRating(title, rating);
			
			videoStore.checkout(title);
			videoStore.returnVideo(title);
		}
		
		System.out.print("Enter the rented video title: ");
		String title = sc.nextLine();
		videoStore.checkout(title);
		videoStore.listInventory();
		sc.close();
	}

}
