package cn.kpl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UploadController {

    private final Logger logger = LoggerFactory.getLogger(UploadController.class);

    @RequestMapping("/download")
    //@CrossOrigin
    @ResponseBody
    public void download(@RequestParam(value="filename") String filename, HttpServletRequest request, HttpServletResponse response){
        Map<String,String> resultMap = new HashMap<>();

        String realPath = "F://";
        File file = new File(realPath , filename);
        System.out.println(file.getAbsolutePath());
        if (file.exists()) {
            response.addHeader("Content-Type","application/octet-stream");
            response.setContentType("application/force-download");// 设置强制下载不打开
            response.addHeader("Content-Disposition", "attachment;fileName=" + filename);// 设置文件名
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int len = 0;
                System.out.println(file.length());
                while ((len =  bis.read(buffer)) != -1) {
                    os.write(buffer, 0, len);
                    os.flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
                resultMap.put("BK_MSG","success");
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            logger.warn("文件" + filename + "不存在");
        }
    }

    @RequestMapping("/upload")
    @CrossOrigin
    @ResponseBody
    public Map<String,String> findUser(@RequestParam(value="files") MultipartFile file) {
        Map<String,String> resultMap = new HashMap<>();

        try {
            if (file.isEmpty()) {
                return null;
            }
            // 获取文件名
            String fileName = file.getOriginalFilename();
            logger.info("上传的文件名为：" + fileName);
            // 获取文件的后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            logger.info("文件的后缀名为：" + suffixName);

            // 设置文件存储路径
            String filePath = "F://";
            String path = filePath + fileName + suffixName;

            File dest = new File(path);
            // 检测是否存在目录
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();// 新建文件夹
            }
            file.transferTo(dest);// 文件写入
            resultMap.put("BK_MSG", "上传成功");
            return resultMap;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        resultMap.put("BK_MSG", "上传失败");
        return resultMap;
    }
}
