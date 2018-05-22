package com.zixuapp.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletUtils {
    /***
     * 提取post过来的数据
     * @param r request
     * @return 返回字符串
     * @throws IOException io流异常
     */
    public static String requestString(HttpServletRequest r) throws IOException {
        r.setCharacterEncoding("utf-8");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(r.getInputStream(), "UTF-8"))) {
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (IOException e) {
            return null;
        }
    }

    /***
     * 返回字符串到客户端
     * @param r response
     * @param s String
     */
    public static void responseString(HttpServletResponse r, String s) throws IOException {
        r.setContentType("text/html;charset=utf-8");
        PrintWriter pw = null;
        pw = r.getWriter();
        pw.append(s);
        pw.flush();
        pw.close();
    }
}
