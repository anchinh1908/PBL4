/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectSocket;

import Model.M_Nhanvien;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;
import View.Home;
/**
 *
 * @author ASUS
 */
public class SVSocket {
    public List<Socket> clientList;
    private ServerSocket server ;
    private int port;
    DefaultListModel modelList;
    private Home homeframe;

    public void setHomeFrame(Home homeFrame) {
    this.homeframe = homeFrame;
    }
    public SVSocket() {
        port = 1234;
        clientList = new ArrayList<>();
        Connect();
    }
    private void Connect() {
       Thread listenThread = new Thread(() -> {
            try {
                server = new ServerSocket(port, 100);
                while (true) {
                    Socket clientSocket = server.accept(); // Chấp nhận kết nối từ client
                    clientList.add(clientSocket); // Thêm client vào danh sách

                    //
                    InetAddress clientAddress = clientSocket.getInetAddress();
                    int clientPort = clientSocket.getPort();
                    JOptionPane.showMessageDialog(null, "client đã kết nối");
                    // Tạo luồng nhận thông tin từ client
                    Thread receiveThread = new Thread(() -> {
                        try {
                            // Xử lý dữ liệu nhận được từ client
                            // ...

                            // Đóng kết nối với client khi cần thiết
                            clientSocket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    receiveThread.setDaemon(true);
                    receiveThread.start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        listenThread.setDaemon(true);
        listenThread.start();
    }

    
    // nhận từ client
    public void Receive(Socket cSoc) throws IOException, SQLException, ClassNotFoundException
    {
    try {
        while (true) {
            
        // Đọc dữ liệu đầu tiên từ máy khách
        byte[] markerData = new byte[6];
        int bytesRead = cSoc.getInputStream().read(markerData);

        if (bytesRead != -1) {
            String marker = new String(markerData, 0, bytesRead);
            
            // Xác định kiểu dữ liệu
            if (marker.equals("DATA: ")) {
                // Khởi tạo mảng byte để nhận dữ liệu
                byte[] data = new byte[2000 * 2000];
                cSoc.getInputStream().read(data);

                // Chuyển data từ dạng byte sang dạng đối tượng
                Object receivedObject = Deserialization(data);

                if (receivedObject instanceof List<?>) {
                    List<?> dataList = (List<?>) receivedObject;

                    for (Object rowObject : dataList) {
                        if (rowObject instanceof List<?>) {
                            List<?> row = (List<?>) rowObject;

                            if (row.get(0).toString().equals("add")) {
                                M_Nhanvien nv=new M_Nhanvien();
                                nv.setManv(row.get(1).toString());
                                nv.setTennv(row.get(2).toString());
                                nv.setChucvu(row.get(3).toString());
                                //date
                                String dateString = row.get(4).toString();
    //                            nv.setDate(Date.(row.get(4).toString()));
                                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Điều chỉnh định dạng phù hợp
                                Date date = null;
                                try {
                                    date = dateFormat.parse(dateString);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                // Kiểm tra nếu date đã được khởi tạo thành công trước khi sử dụng
                                if (date != null) {
                                    // Sử dụng date trong logic của bạn
                                    nv.setDate(date);
                                } else {
                                    // Xử lý khi có lỗi chuyển đổi
                                    System.out.println("Lỗi chuyển đổi chuỗi thành Date.");
                                }
                                //
                                nv.setGt(row.get(4).toString());
                                nv.setDiachi(row.get(6).toString());
                                nv.setEmail(row.get(3).toString());
                                nv.setLuong(Integer.parseInt(row.get(6).toString()));
                                // Thực hiện lưu trữ dữ liệu vào cơ sở dữ liệu của bạn
                                // ...

                            } else if (row.get(0).toString().equals("edit")) {
                                M_Nhanvien nv=new M_Nhanvien();
                                nv.setManv(row.get(1).toString());
                                nv.setTennv(row.get(2).toString());
                                nv.setChucvu(row.get(3).toString());
                                //date
                                String dateString = row.get(4).toString();
    //                            nv.setDate(Date.(row.get(4).toString()));
                                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Điều chỉnh định dạng phù hợp
                                Date date = null;
                                try {
                                    date = dateFormat.parse(dateString);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                // Kiểm tra nếu date đã được khởi tạo thành công trước khi sử dụng
                                if (date != null) {
                                    // Sử dụng date trong logic của bạn
                                    nv.setDate(date);
                                } else {
                                    // Xử lý khi có lỗi chuyển đổi
                                    System.out.println("Lỗi chuyển đổi chuỗi thành Date.");
                                }
                                //
                                nv.setGt(row.get(4).toString());
                                nv.setDiachi(row.get(6).toString());
                                nv.setEmail(row.get(3).toString());
                                nv.setLuong(Integer.parseInt(row.get(6).toString()));
                                // Thực hiện cập nhật dữ liệu trong cơ sở dữ liệu của bạn
                                // ...

                            } else if (row.get(0).toString().equals("delete")) {
                                String masv = row.get(1).toString();

                                // Thực hiện xóa dữ liệu trong cơ sở dữ liệu của bạn
                                // ...
                            }
                        }
                    }
            
                }
            }else if (marker.equals("TEXT: ")) {
                // Xử lý thông điệp văn bản
                byte[] textData = new byte[20];
                bytesRead = cSoc.getInputStream().read(textData);
                String message = new String(textData, 6, bytesRead);
                if (homeframe != null) {
                       homeframe.updateListModel("Client: "+ message + "đã kết nối");
                    }
                
            }
            }
        else{System.out.println("ConnectSocket.SVSocket.Receive()");}
        }
     
    }catch (Exception e) {
        clientList.remove(cSoc);
        try {
            cSoc.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    }
    
   
            
    // chuyển  obj thàng mảng
       public byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ObjectOutputStream objectStream = new ObjectOutputStream(byteStream);
        objectStream.writeObject(obj);
        objectStream.flush();
        byte[] byteArray = byteStream.toByteArray();
        objectStream.close();
        byteStream.close();
        return byteArray;
    }
    private byte[] serialize(DefaultTableModel dtm) throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(dtm);
        oos.flush();
        return baos.toByteArray();
    }
       //chuyển mảng thàng Obj
    public Object Deserialization(byte[] data) {
         try {
            ByteArrayInputStream byteStream = new ByteArrayInputStream(data);
            ObjectInputStream objectStream = new ObjectInputStream(byteStream);
            Object obj = objectStream.readObject();
            objectStream.close();
            byteStream.close();
            return obj; // Trả về đối tượng sau khi phân giải ngược
             
         }catch(IOException| ClassNotFoundException e){
            e.printStackTrace();
            return null;            
         }
        }
    
        public void Close()
    {
        try{
            server.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public void SendDATA(Socket client,DefaultTableModel dtm)
    {
        if(client != null){
           try{
               ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
               out.writeObject(serialize(dtm));
               out.flush();
               
           }catch(IOException e)
           {
               e.printStackTrace();
           }
        }
    }
    public void SendMess(Socket client, String mess){
        if(client != null){
           try{
               ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
               out.writeObject(mess);
               out.flush();
               
           }catch(IOException e)
           {
               e.printStackTrace();
           }
        }
    }
  
    
}
