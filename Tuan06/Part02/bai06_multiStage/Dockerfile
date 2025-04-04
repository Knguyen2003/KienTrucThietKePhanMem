# Stage 1: Build
FROM node:18 AS build

# Set working directory
WORKDIR /app

# Copy package.json và package-lock.json
COPY package*.json ./

# Cài đặt dependencies
RUN npm install

# Copy mã nguồn vào container
COPY . .

# Build ứng dụng (nếu cần)
RUN npm run build

# Stage 2: Run
FROM node:18-alpine

# Set working directory
WORKDIR /app

# Copy mã nguồn đã build từ stage 1
COPY --from=build /app .

# Cài đặt dependencies chỉ ở môi trường production
RUN npm install --only=production

# Mở port cho ứng dụng
EXPOSE 3000

# Chạy ứng dụng
CMD ["npm", "start"]
