import os

app_env = os.getenv("APP_ENV", "unknown")  # Đọc biến môi trường APP_ENV
print(f"The environment is: {app_env}")
