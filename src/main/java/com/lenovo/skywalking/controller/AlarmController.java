package com.lenovo.skywalking.controller;

import com.lenovo.skywalking.dto.AlartmDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/alarm")
@Slf4j
public class AlarmController {

    private String content = "";

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Value("${spring.mail.username}")
    private String from;

    @PostMapping("/receive")
    public void receive(@RequestBody List<AlartmDto> alarmList) {

        System.out.println("进入receive方法" + alarmList.toString());
        SimpleMailMessage message = new SimpleMailMessage();
        // 发送者邮箱
        message.setFrom(from);
        // 接收者邮箱
        message.setTo("gaoyang32@Lenovo.com");
        // 主题
        message.setSubject("告警邮件");
        content = getContent(alarmList);
        // 邮件内容
        message.setText(content);
        javaMailSender.send(message);
        log.info("告警邮件发送..." + content);
    }

    private String getContent(List<AlartmDto> alarmList) {
        Date d = null;
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        StringBuilder builder = new StringBuilder();
        for (AlartmDto dto : alarmList) {
            d = new Date(dto.getStartTime());
            builder.append("\nscopeId:").append(dto.getScopeId())
                    .append("\nscope:").append(dto.getScope())
                    .append("\nscope名称:").append(dto.getName())
                    .append("\nid0").append(dto.getId0())
                    .append("\nid1:").append(dto.getId1())
                    .append("\nruleName").append(dto.getRuleName())
                    .append("\nmessage").append(dto.getAlarmMessage())
                    .append("\n告警时间:").append(sf.format(d))
                    .append("\n\n------------\n\n");
        }
        return builder.toString();
    }

    @GetMapping("/show")
    public String show() {
        return content;
    }
}
