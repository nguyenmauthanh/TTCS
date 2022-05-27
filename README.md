// Ứng dụng Blog (môn Thực tập cơ sở thầy Nguyễn Duy Phương)

// Công nghệ sử dụng
Java 8,
Spring Boot v2.2.6,
Spring Web,
Spring Data JPA,
Spring Security,
Lombok,
Thymeleaf
Maven.

// Các tính năng của ứng dụng
- Người dùng blog chưa đăng ký/ ẩn danh có thể xem tất cả bài viết và nhận xét.
- Người dùng đã đăng ký và đăng nhập (Người dùng được xác thực)
  có thể thêm bài viết mới, chỉ xem bài viết của chính họ, chỉnh sửa hoặc xóa chúng (chức năng CRUD);
- Người dùng có thể viết bình luận cho các bài đăng cụ thể của chính mình hoặc người dùng khác.
- Validation for creating new posts, body must not be empty, title must have length of 7 by default and other;
- Các quy tắc xác thực và ủy quyền của Spring Security đảm bảo rằng người dùng chỉ có thể chỉnh sửa hoặc xóa các bài đăng của chính họ;
- Giao diện người dùng(Front-end) được tạo bằng cách sử dụng các mẫu Thymeleaf.

// Người thực hiện Nguyễn Mậu Thành - B19DCCN652