from minio import Minio as s3
from minio.error import S3Error
import os
from dotenv import load_dotenv
load_dotenv()

FILE="upload_to_s3.py"
BUCKET_NAME="minio-bucket"
ACCESS_KEY=os.getenv("ACCESS_KEY")
SECRET_KEY=os.getenv("SECRET_KEY")
HOST=os.getenv("MINIO_HOST")
PORT=os.getenv("MINIO_PORT")
#testing cicd josevaldo
def getS3Client(key, secret, host, port):
    try:
        minio_client=s3(f'{host}:{port}',
        access_key=key,
        secret_key=secret,
        secure=True)
        print("Minio Client Created")
        return minio_client
        
    except S3Error as e:
        print(f'{e}')

def checkBucketExists(s3_client, bucket_name):
    try:
        bucket=s3_client.bucket_exists(bucket_name)
        if not bucket:
            s3_client.make_bucket(bucket_name)
            print("Bucket Verified")
        else:
            print("Bucket Verified")    
    except S3Error as e:
        print(f'{e}')
        
def main():
    s3_client= getS3Client(key=ACCESS_KEY,secret=SECRET_KEY, host=HOST, port=PORT)
    try:
            checkBucketExists(s3_client=s3_client, bucket_name=BUCKET_NAME)
            s3_client.fput_object(BUCKET_NAME, FILE, FILE)
            print("File Uploaded")

    except Exception as e:
            print(f'{e}')


if __name__=="__main__":
    main()



