import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;

/**
 * Created by wescratty on 9/19/15.
 */
public class AudioClass {
    private static AudioClass ourInstance = new AudioClass();  //
    /** Static 'instance' method */
    public static AudioClass getInstance() {
        return ourInstance;
    }

    /** A private Constructor prevents any other
     * class from instantiating.
     */
    private AudioClass() {}

    /** Other methods protected by singleton-ness */

    AudioFormat format = new AudioFormat(44100, 16, 2, true, true);

    DataLine.Info targetInfo = new DataLine.Info(TargetDataLine.class, format);
    DataLine.Info sourceInfo = new DataLine.Info(SourceDataLine.class, format);
    TargetDataLine targetLine;
    SourceDataLine sourceLine;
    byte[] targetData;

    /** Other methods protected by singleton-ness */
    protected byte[] getAudio()
    {

        try {
            targetLine = (TargetDataLine) AudioSystem.getLine(targetInfo);
            targetLine.open(format);
            targetLine.start();

            sourceLine = (SourceDataLine) AudioSystem.getLine(sourceInfo);
            sourceLine.open(format);
            sourceLine.start();

            int numBytesRead;
            int stopAt  =0;
            targetData = new byte[targetLine.getBufferSize() / 5];

            while (stopAt<50) {
                stopAt++;
                numBytesRead = targetLine.read(targetData, 0, targetData.length);
                if (numBytesRead == -1)	break;

                sourceLine.write(targetData, 0, numBytesRead);
            }
            targetLine.stop();
            targetLine.close();
            sourceLine.stop();
            sourceLine.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return targetData;
    }
}
