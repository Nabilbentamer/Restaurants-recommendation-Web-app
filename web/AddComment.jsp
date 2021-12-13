<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Document</title>
</head>
<body>

        <h4>Add a comment</h4>
        

                                                       
        <form action="AddCommentNew" method="post">
            
                    <div class="rating"> 
                            <input type="radio" name="rating" value="5" id="5"><label for="5">☆</label> 
                            <input type="radio" name="rating" value="4" id="4"><label for="4">☆</label> 
                            <input type="radio" name="rating" value="3" id="3"><label for="3">☆</label> 
                            <input type="radio" name="rating" value="2" id="2"><label for="2">☆</label> 
                            <input type="radio" name="rating" value="1" id="1"><label for="1">☆</label> 
        </div>
                                
                                
                        <textarea class="form-control" placeholder="what do you think?" rows="4" name="textArea"></textarea> 
                        <input type="hidden"  name="memberId" value="${memberId}" >
                        <input type="hidden" name="restauId" value="${restauId}">
                        <input type="submit" class="btn btn-success btn-sm" value="cancel"> 
                        <input type="submit" value="save">
        </form>

                        <script>
                            
                        </script>                        

</body>
</html>