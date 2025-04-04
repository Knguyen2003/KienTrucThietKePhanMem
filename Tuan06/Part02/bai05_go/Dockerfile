# Chỉ định image Go chính thức làm base image
FROM golang:1.20-alpine

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Copy mã nguồn Go vào container
COPY . .

# Build ứng dụng Go
RUN go mod init my-go-app
RUN go mod tidy
RUN go build -o my-go-app .

# Mở cổng 8080
EXPOSE 8080

# Chạy ứng dụng Go
CMD ["./my-go-app"]
