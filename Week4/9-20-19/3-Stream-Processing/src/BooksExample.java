
/*
Example of a use case for streams:

        Let’s say, for example, that you have a list of books
        and you want to get a list of unique authors for these books,
        in alphabetical order:

        // Old way
        public List<Author> getAllAuthorsAlphabetically(List<Book> books) {
        List<Author> authors = new ArrayList<>();

        for (Book book : books) {
        Author author = book.getAuthor();
        if (!authors.contains(author)) {
        authors.add(author);
        }
        }
        ​
        Collections.sort(authors, new Comparator<Author>() {
        public int compare(Author o1, Author o2) {
        return o1.getSurname().compareTo(o2.getSurname());
        }
        });
        return authors;
        }
        ​
        In the code above, we first iterate through the list of books,
        adding the book’s author to the author list if it hasn’t seen it
        before; then we sort the authors alphabetically by surname. This
        is exactly the sort of operation that streams have been designed
        to solve elegantly:
        ​
        // New way
        public List<Author> getAllAuthorsAlphabetically(List<Book> books) {
        return books.stream()
        .map(book -> book.getAuthor())
        .distinct()
        .sorted((o1, o2) -> o1.getSurname().compareTo(o2.getSurname()))
        .collect(Collectors.toList());
        }
        */