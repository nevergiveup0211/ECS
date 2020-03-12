
FROM node:8-alpine
Run mkdir -p D:\app
WORKDIR D:\app
COPY . .
RUN npm install
EXPOSE 3000
CMD [ "node", "new.js" ]
