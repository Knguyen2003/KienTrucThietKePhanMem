const express = require("express");
const db = require("./database"); // Đường dẫn đến file database.js

const app = express();
const PORT = 3000;

app.get("/", (req, res) => {
  res.send("🚀 Server Node.js đang chạy!");
});

// API kiểm tra MySQL
app.get("/users", (req, res) => {
  db.query("SELECT * FROM users", (err, results) => {
    if (err) {
      res.status(500).send("❌ Lỗi khi truy vấn MySQL");
      return;
    }
    res.json(results);
  });
});

app.listen(PORT, () => {
  console.log(`✅ Server đang chạy tại http://localhost:${PORT}`);
});
