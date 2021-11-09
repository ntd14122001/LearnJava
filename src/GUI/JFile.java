package GUI;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.TextArea;
 
public class JFile extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btOpenFile = new JButton("Open File");
    private JButton btSaveFile = new JButton("Save File");
    private final TextArea textArea = new TextArea();
     
    public JFile(){
    	 super("Xử lý văn bản ");
        initComponents();
    }
     
    public void initComponents(){
        JPanel panelControl = new JPanel(new FlowLayout());
        panelControl.add(btOpenFile);
        panelControl.add(btSaveFile);
 
        getContentPane().setLayout(new BorderLayout());
        this.setSize(500, 400);
        getContentPane().add(panelControl, BorderLayout.NORTH);
        
        getContentPane().add(textArea, BorderLayout.CENTER);
        this.setVisible(true);
         
        btOpenFile.addActionListener(this);
        btSaveFile.addActionListener(this);
    }
     
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btOpenFile){
            JFileChooser chooser = new JFileChooser();
            chooser.setSize(500, 400);
            int value = chooser.showOpenDialog(this);
            if(value == JFileChooser.OPEN_DIALOG){
                File file = chooser.getSelectedFile();
                String s = MyFile.readFile(file);
                textArea.setText(s);
            }
        }
         
        if(e.getSource() == btSaveFile){
            JFileChooser chooser = new JFileChooser();
            int value = chooser.showSaveDialog(this);
            if(value == JFileChooser.APPROVE_OPTION){
 
                File file = chooser.getSelectedFile(); // Khởi tạo file (nếu chưa có thì tạo file mới)
                 
                if( ! MyFile.writeFile(file, textArea.getText().toString())){
                    JOptionPane.showMessageDialog(null, "Lỗi lưu file", "Thông báo", JOptionPane.CLOSED_OPTION);
                }
            }
        }
    }
    public static void main(String[] args) {
        new JFile();
    }
    class MyFile{
        
        public static boolean createFile(String url){
            try {
                new File(url).createNewFile();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }
         
        public static File openFile(String url){
            File file = new File(url);
            // Nếu đường dẫn không tồn tại
            if(! file.exists() || ! file.isFile()){
                return null;
            }       
            return file;
        }
         
        public static String readFile(File file){
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(file);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            String s = new String();
            try {
                while(dataInputStream.available() > 0){
                    s += dataInputStream.readChar();
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
             
            return s;
        }
         
        public static boolean writeFile(File file, String s){
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            }
            DataOutputStream outputStream = new DataOutputStream(fileOutputStream);
             
            try {
                outputStream.writeChars(s);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
             
            return true;
        }
    }
}