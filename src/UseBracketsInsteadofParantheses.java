import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class UseBracketsInsteadofParantheses {

	public static void main(String[] args) throws InterruptedException {

		// before java 8

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Before Java8 !");

			}

		}).start();

		Thread.sleep(1000);
		new Thread(() -> System.out.println("In Java8!")).start();

		// Before Java 8:
		JButton show = new JButton("Show");
		show.addActionListener(new ActionListener()

		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("without lambda expression is boring");
			}

		});

		// Java 8 way:
		show.addActionListener((e) -> {
			System.out.println("Action !! Lambda expressions Rocks");
		});

	}

}
