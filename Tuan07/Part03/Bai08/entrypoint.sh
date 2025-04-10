#!/bin/bash

# Thoát ngay nếu có lệnh nào lỗi
set -e

# Chờ Redis sẵn sàng
echo "Waiting for Redis..."
sleep 5

if [ "$1" = "web" ]; then
    echo "Starting Django Server..."
    exec python /app/app/manage.py runserver 0.0.0.0:8000
elif [ "$1" = "celery" ]; then
    echo "Starting Celery Worker..."
    exec celery -A myproject worker --loglevel=info
else
    exec "$@"
fi
