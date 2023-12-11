import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;

public class ImageViewer {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Использование: java ImageViewer <путь_к_изображению>");
            System.exit(1);
        }

        String imagePath = args[0];
        System.out.println(imagePath);

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(imagePath);
            }
        });
    }

    private static void createAndShowGUI(String imagePath) {
        JFrame frame = new JFrame("Просмотр изображения");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon(imagePath);
        JLabel label = new JLabel(icon);

        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null); // Чтобы окно появилось по центру экрана
        frame.setVisible(true);
    }
}
