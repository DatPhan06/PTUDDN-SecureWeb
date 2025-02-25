# PTUDDN-SecureWeb

## Tổng quan
Dự án này là một demo về bảo mật ứng dụng web sử dụng Spring Boot và Spring Security. Nó bao gồm các tính năng xác thực và ủy quyền cơ bản, với một kho người dùng trong bộ nhớ đơn giản.

## Tính năng
- Xác thực và ủy quyền cơ bản
- Trang đăng nhập tùy chỉnh
- Kho người dùng trong bộ nhớ
- Giao diện sử dụng Thymeleaf
- Đăng ký, đăng nhập tài khoản thường, admin
- Có thể thêm, sửa, xóa người dùng thông qua trang admin

## Yêu cầu
- Java 17
- Maven hoặc Gradle

## Cài đặt
1. Clone repository:
    ```sh
    git clone https://github.com/DatPhan06/PTUDDN-SecureWeb.git
    cd PTUDDN-SecureWeb
    ```

2. Build dự án sử dụng Maven:
    ```sh
    mvn clean install
    ```

3. Chạy ứng dụng:
    ```sh
    mvn spring-boot:run
    ```


## Demo
- Trang chủ:
    ![Trang chủ](src/main/resources/img/home.png)
- Sau khi ấn vào nút click, đến trang đăng nhập:
    ![Trang đăng nhập](src/main/resources/img/LoginAfterClick.png)
- Trang đăng nhập:
    ![Trang đăng nhập](src/main/resources/img/login.png)
- Trang đăng ký:
   ![Trang đăng ký](src/main/resources/img/register.png)
- Trang chào:
    ![Trang chào](src/main/resources/img/HelloPage.png)
- Trang admin:

    ![Trang admin](src/main/resources/img/AdminPage.png)
- Trang admin với tài khoản thường:
![Trang admin với tài khoản thường](src/main/resources/img/AdminPageWithUserAccount.png)

## Cấu trúc dự án
- `src/main/java/com/example/securingweb/`: Các file nguồn Java
- `src/main/resources/templates/`: Các template Thymeleaf
- `src/main/resources/static/img/`: Hình ảnh cho demo
