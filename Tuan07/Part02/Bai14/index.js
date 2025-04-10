const express = require("express");
const mysql = require("mysql2");
const dotenv = require("dotenv").config();

const app = express();
const port = 3000;

// Kết nối MySQL bằng các biến môi trường từ Docker Compose
const db = mysql.createConnection({
  host: process.env.DB_HOST, // 'mysql' (tên service)
  user: process.env.DB_USER, // 'user'
  password: process.env.DB_PASSWORD, // 'password'
  database: process.env.DB_NAME, // 'mydb'
});

// Kiểm tra kết nối
db.connect((err) => {
  if (err) {
    console.error("Lỗi kết nối MySQL:", err);
  } else {
    console.log("✅ Kết nối MySQL thành công!");
  }
});

app.get("/", (req, res) => {
  res.send("Hello from Node.js + MySQL!");
});

app.listen(port, () => {
  console.log(`🚀 Server đang chạy tại http://localhost:${port}`);
});
