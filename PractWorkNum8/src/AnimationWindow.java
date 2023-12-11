import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimationWindow extends JFrame {
    private JLabel animationLabel;
    private ImageIcon[] frames;
    private int currentFrameIndex;
    private Timer animationTimer;

    public AnimationWindow() {
        // Загружаем кадры анимации
        frames = new ImageIcon[20];
        for (int i = 0; i < 20; i++) {
            if (i >= 10) {
                frames[i] = new ImageIcon("frame_" + i + "_delay-0.04s.png"); // Подставьте путь к вашим изображениям
            } else {
                frames[i] = new ImageIcon("frame_0" + i + "_delay-0.04s.png"); // Подставьте путь к вашим изображениям
            }
        }

        animationLabel = new JLabel();
        add(animationLabel);

        // Настроим таймер для анимации
        currentFrameIndex = 0;
        animationTimer = new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Переключаем кадры
                animationLabel.setIcon(frames[currentFrameIndex]);
                currentFrameIndex = (currentFrameIndex + 1) % frames.length;
            }
        });
        animationTimer.start();

        setTitle("Анимация");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AnimationWindow animationWindow = new AnimationWindow();
                animationWindow.setVisible(true);
            }
        });
    }
}
