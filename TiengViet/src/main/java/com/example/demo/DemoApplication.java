package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class DemoApplication {
    public static class CountVietnameseLetters {
        public static boolean isVietnameseLetter(char c) {
            String vietnameseLetters = "áàảãạâấầẩẫậăắằẳẵặéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵ";


            return vietnameseLetters.indexOf(Character.toLowerCase(c)) != -1;
        }

        public static int countVietnameseLettersInString(String input) {
            int count = 0;
            for (char c : input.toCharArray()) {
                if (isVietnameseLetter(c)) {
                    count++;
                }
            }
            return count;
        }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi chữ cái Latinh: ");
        String user_input = scanner.nextLine();
        int result = countVietnameseLettersInString(user_input);
        System.out.println("Số lượng chữ cái tiếng Việt có thể tạo thành chuỗi trong chuỗi Latinh là: " + result);
        scanner.close();
    }

}}
