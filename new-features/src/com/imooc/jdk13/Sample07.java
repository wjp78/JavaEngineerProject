package com.imooc.jdk13;

// 文本块特性
public class Sample07 {
    public static void main(String[] args) {
        String str = "<html>\n\t<head>\n\t</head>\n\t<body>\n\t\t我是正文\n\t</body>\n</html>";
        System.out.println(str);
        String str1 = "<html>\n" +
                "\t<head>\n" +
                "\t</head>\n" +
                "\t<body>\n" +
                "\t\t我是正文\n" +
                "\t</body>\n" +
                "</html>";
        // 文本块特性
        String str2 = """
                <html>
                	<head>
                	</head>
                	<body>
                		我是正文
                	</body>
                </html>
                """;
        System.out.println(str2);

    }
}
