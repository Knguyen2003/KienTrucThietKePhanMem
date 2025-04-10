import os
from pathlib import Path

# Định nghĩa thư mục gốc của dự án
BASE_DIR = Path(__file__).resolve().parent.parent

# Bật chế độ debug (có thể tắt trong môi trường production)
DEBUG = True

# Cho phép tất cả host truy cập (chỉ dùng trong development)
ALLOWED_HOSTS = ["*"]

# Ứng dụng Django được cài đặt
INSTALLED_APPS = [
    "django.contrib.admin",
    "django.contrib.auth",
    "django.contrib.contenttypes",
    "django.contrib.sessions",
    "django.contrib.messages",
    "django.contrib.staticfiles",
    "myapp",
]

# Middleware xử lý request/response
MIDDLEWARE = [
    "django.middleware.security.SecurityMiddleware",
    "django.contrib.sessions.middleware.SessionMiddleware",
    "django.middleware.common.CommonMiddleware",
    "django.middleware.csrf.CsrfViewMiddleware",
    "django.contrib.auth.middleware.AuthenticationMiddleware",
    "django.contrib.messages.middleware.MessageMiddleware",
    "django.middleware.clickjacking.XFrameOptionsMiddleware",
]

# Cấu hình URL
ROOT_URLCONF = "myproject.urls"

# Cấu hình cơ sở dữ liệu (sử dụng SQLite)
DATABASES = {
    "default": {
        "ENGINE": "django.db.backends.sqlite3",
        "NAME": BASE_DIR / "db.sqlite3",
    }
}

# Cấu hình Redis cho Celery
CELERY_BROKER_URL = "redis://redis:6379/0"
CELERY_ACCEPT_CONTENT = ["json"]
CELERY_TASK_SERIALIZER = "json"

# Cấu hình tệp tĩnh
STATIC_URL = "/static/"
