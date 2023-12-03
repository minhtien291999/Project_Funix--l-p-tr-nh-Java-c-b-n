# Title : 
Introduction : Tập trung vào việc vận dụng các kiến thức cơ bản về lập trình java hướng đối tượng để ứng dụng vào việc giải quyết một số từng bài toán cụ thể.
Bài sẽ bao gồm 5 nội dung chính (chi tiết các bài tập nằm trong phần hướng dẫn assignment):
Đọc hiểu/phân tích yêu cầu đề bài.
Lên ý tưởng, giải pháp và cách giải quyết bài toán trên giấy.
Dựa trên giải pháp đã đưa ra, thực hiện viết code cho giải pháp.
Thực hiện chạy chương trình, nhập dữ liệu để kiểm tra xem chương trình có hoạt động đúng theo yêu cầu?
Tiến hành sửa lỗi nếu phát sinh.
Với mỗi nội dung bên trên, chúng ta sẽ cần đáp ứng các yêu cầu sau:

Phân tích rõ những gì đề bài yêu cầu, tránh bỏ sót thông tin cũng như đi lệch hướng.
Với mỗi đề bài, liệt kê các giải pháp lên giấy và lựa chọn giải pháp tối ưu, phù hợp nhất. Cuối cùng là triển khai ý tưởng.
Quá trình code phải bám sát giải pháp đã đưa ra để đảm bảo không phát sinh nhiều lỗi tiềm ẩn.
Thực hiện test chương trình với các bộ tham số đầu vào khác nhau, kiểm tra kết quả đầu ra đảm bảo đúng theo yêu cầu bài toán.

Install : Elipse IDE :java

Use : Giải quyết các bài toán : 

Bài 1 :Nếu nhập vào chuỗi:
CONG thì thực hiện gọi hàm tinhCong()
TRU thì thực hiện gọi hàm tinhTru()
NHAN thì gọi hàm tinhNhan() 
CHIA  thì gọi hàm tinhChia() trong class CalculateUtils
Nếu người dùng nhập vào action không phải là các giá trị trên thì in ra thông báo: “Giá trị ACTION không hợp lệ” và kết thúc chương trình.
In kết quả vừa thực hiện được ra màn hình.

Bài 2 :Nhập vào một số nguyên bất kỳ từ bàn phím N>0. Nếu N>0 thì mới thực hiện các bước tiếp theo
Tính tổng các số chẵn và tổng các số lẻ từ 0 đến N. In kết quả ra màn hình
Đếm xem  từ 0 đến N có bao nhiều số chia hết cho 3 nhưng không chia hết cho 2
In kết quả ra màn hình.

Bài 3 :
a. Sử dụng vòng lặp WHILE hoặc DO…WHILE để nhập thông tin Student từ bàn phím.  
Sau mỗi lần nhập đầy đủ thông tin của một Student thì tiếp tục  in ra thông báo: “Do you want to continue (Y/N)?”. 
-  Nếu người dùng nhập Y thì chương trình tiếp tục cho nhập Student tiếp theo, 
- Nếu người dùng nhập N thì dừng nhập Student.  
Sử dụng mảng ArrayList để tạo danh sách lưu các Student vừa nhập

b. In ra tất cả Student trong danh sách theo định dạng:

Student 1:
FullName:…
Address: …
DOB: …
Gender: …
FinalGrade: …

Student 2:
FullName:…
Address: …
DOB: …
Gender: …
FinalGrade: …
Student N ………………………..

c. Sử dụng vòng lặp FOR để in ra danh sách vừa nhập. Xét finalGrade:
Nếu: finalGrade < 4.0 thì in ra  Học sinh  <fullName> học lực kém
Nếu  4.0 <= finalGrade < 5.0 thì in ra  Học sinh  <fullName> học lực yếu
Nếu  5.0 <= finalGrade< 5.5  thì in ra  Học sinh  <fullName> học lực  trung bình  yếu.
Nếu  5.5 <= finalGrade < 6.5 thì in ra  Học sinh  <fullName> học lực trung bình
Nếu  6.5 <= finalGrade < 7.0  thì in ra  Học sinh  <fullName> học lực trung bình khá
Nếu  7.0 <= finalGrade < 8.0   thì in ra  Học sinh  <fullName> học lực khá
Nếu  8.0 <= finalGrade < 8.5  thì in ra  Học sinh  <fullName> học lực khá giỏi
Nếu  8.5 <= finalGrade <= 10.0  thì in ra  Học sinh  <fullName> học lực giỏi
d. Tính điểm tổng kết trung bình của danh sách học sinh  (tổng điểm /số lượng)
