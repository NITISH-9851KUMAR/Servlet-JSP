package BasicsProgram;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/photo-upload")
@MultipartConfig(maxFileSize = 1024 * 1024 * 10) // 10mb maximum It handles different type of data
public class PhotoStore extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userName = request.getParameter("userName").trim();
        Part photoPart = request.getPart("userPhoto");

        // Read File Name as string
        String fileName = photoPart.getSubmittedFileName().trim();

        // Save file to Local Folder
        String uploadPath = getServletContext().getRealPath("/image");
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) // if File exists then make it directory
            uploadDir.mkdirs();

        photoPart.write(uploadPath + File.separator + fileName);
        // It save photo in the folder

        //--------SAVE FILE NAME INTO DATABASE as String --------
        Connection con = null;
        PreparedStatement pst = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/servlet",
                    "root",
                    "Nitish@04"
            );

            String sql = "INSERT INTO photos (name, photo) VALUES (?, ?)";
            pst = con.prepareStatement(sql);

            pst.setString(1, userName);
            pst.setString(2, fileName);

            pst.executeUpdate();

            response.getWriter().println("Photo saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }

        HttpSession session= request.getSession();
        session.setAttribute("photo", fileName);
        response.sendRedirect("photo-show.jsp");

    }
}

