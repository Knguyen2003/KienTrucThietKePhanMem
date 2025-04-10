# Sử dụng Node.js phiên bản 18
FROM node:18

# Đặt thư mục làm việc
WORKDIR /app

# Copy file package.json vào container
COPY package*.json ./

# Cài đặt dependencies
RUN npm install

# Copy toàn bộ mã nguồn
COPY . .

# Expose cổng 3000
EXPOSE 3000

# Chạy ứng dụng
CMD ["npm", "start"]
