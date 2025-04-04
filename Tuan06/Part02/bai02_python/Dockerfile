# Sử dụng python:3.9 làm base image
FROM python:3.9

# Cài đặt thư viện cần thiết
RUN pip install --no-cache-dir flask

# Copy ứng dụng vào container
COPY app.py /app.py

# Mở cổng 5000
EXPOSE 5001

# Lệnh chạy khi container bắt đầu
CMD ["python", "app.py"]
