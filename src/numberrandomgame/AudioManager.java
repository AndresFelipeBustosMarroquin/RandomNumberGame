package numberrandomgame;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class AudioManager {
    private static Clip clip;
    private static FloatControl control;
    private static boolean reproduciendo = false;

    public static void cargarSonido(String ruta) throws Exception {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new java.io.File(ruta));
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
    }

    public static void reproducir() {
        if (!reproduciendo) {
            clip.setFramePosition(0);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
            reproduciendo = true;
        }
    }

    public static void detener() {
        if (clip != null) {
            clip.stop();
            reproduciendo = false;
        }
    }

    public static void setVolumen(float valor) {
        if (control != null) control.setValue(valor);
    }

    public static float getVolumen() {
        return control != null ? control.getValue() : -10.0f;
    }
}
